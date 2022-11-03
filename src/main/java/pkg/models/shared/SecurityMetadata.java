package pkg.models.shared;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SecurityMetadata {
    String value() default "";

    String type() default "";
    String subtype() default "";

    String name() default "";;
}
