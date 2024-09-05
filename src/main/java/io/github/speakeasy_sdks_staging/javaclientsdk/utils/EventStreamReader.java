/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EventStreamReader implements AutoCloseable {

    private static final int BUFFER_SIZE = 8192;

    private static final String BYTE_ORDER_MARK = "\uFEFF";

    private final Reader reader;

    private boolean first = true;

    public EventStreamReader(InputStream in) {
        reader = new EventStreamLineReader(
                new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8), BUFFER_SIZE));
    }

    /**
     * Returns the event message (lines separated by \n) without the terminating
     * \n\n. Returns null when end of stream reached (and may occur with a partially
     * read event message that has not yet been terminated). Characters in comment
     * lines are discarded as read (they are not buffered).
     * 
     * @return the event message
     * @throws IOException
     */
    // VisibleForTesting
    public String readRawMessage() throws IOException {
        StringBuilder line = new StringBuilder();
        StringBuilder b = new StringBuilder();

        char previousCh = 0;
        boolean previousAvailable = false;
        boolean isComment = false;
        char ch;
        while (true) {
            int v = reader.read();
            if (v == -1) {
                return null;
            }
            ch = (char) v;
            if (previousAvailable) {
                // note that incoming input stream converts sequences of \r and/or \n to \n
                // characters so we only concern ourselves with \n (divide and conquer)
                if (previousCh == '\n' && ch == '\n') {
                    b.append(line);
                    line.setLength(0);
                    isComment = false;
                    trimTrailingNewLines(b);
                    String msg = b.toString();
                    if (first) {
                        // skip BOM if present in the first message only
                        if (msg.startsWith(BYTE_ORDER_MARK)) {
                            msg = msg.substring(BYTE_ORDER_MARK.length());
                        }
                        first = false;
                    }
                    return msg;
                } else {
                    if (line.length() == 0 && previousCh == ':') {
                        isComment = true;
                    }
                    if (!isComment) {
                        line.append(previousCh);
                        if (previousCh == '\n') {
                            b.append(line);
                            // reset line
                            line.setLength(0);
                        }
                    } else if (previousCh == '\n') {
                        isComment = false;
                    }
                }
            } else {
                previousAvailable = true;
            }
            previousCh = ch;
        }
    }

    public Optional<EventStreamMessage> readMessage() throws IOException {
        String m = readRawMessage();
        if (m == null) {
            return Optional.empty();
        } else {
            return Optional.of(parseMessage(m));
        }
    }

    private static final Pattern LINE_PATTERN = Pattern.compile("^([a-zA-Z]+): ?(.*)$");
    private static final char LINEFEED = '\n';

    // VisibleForTesting
    public static EventStreamMessage parseMessage(String text) {
        String[] lines = text.split("\n");
        Optional<String> event = Optional.empty();
        Optional<String> id = Optional.empty();
        Optional<Integer> retryMs = Optional.empty();
        StringBuilder data = new StringBuilder();
        boolean firstData = true;
        for (String line : lines) {
            Matcher m = LINE_PATTERN.matcher(line);
            if (m.find()) {
                String key = m.group(1).toLowerCase();
                String value = m.group(2);
                if ("event".equals(key)) {
                    event = Optional.of(value);
                } else if ("id".equals(key)) {
                    id = Optional.of(value);
                } else if ("retry".equals(key)) {
                    try {
                        retryMs = Optional.of(Integer.parseInt(value));
                    } catch (NumberFormatException e) {
                        // ignore
                    }
                } else if ("data".equals(key)) {
                    if (!firstData) {
                        data.append(LINEFEED);
                    }
                    firstData = false;
                    data.append(value);
                } // else ignore the line
            }
        }
        return new EventStreamMessage(event, id, retryMs, data.toString());
    }

    private static StringBuilder trimTrailingNewLines(StringBuilder b) {
        int i = 0;
        while (b.length() > i && b.charAt(b.length() - i - 1) == '\n') {
            i++;
        }
        b.setLength(b.length() - i);
        return b;
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }

}
