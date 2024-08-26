package ru.clevertec;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
//Starting from JaCoCo 0.8.2, we can exclude classes and methods by annotating them
// with a custom annotation with the following properties:
//then annotate class(es) or method(s) or constructor(s) that should be excluded from the coverage report.
@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD, CONSTRUCTOR})
public @interface Generated {
}
