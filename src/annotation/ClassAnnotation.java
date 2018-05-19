package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
public @interface ClassAnnotation {
    String value() default "";
}
