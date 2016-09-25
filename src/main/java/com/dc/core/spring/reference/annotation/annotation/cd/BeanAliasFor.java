package com.dc.core.spring.reference.annotation.annotation.cd;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-20-0:06
 */

@Bean
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface BeanAliasFor {
    @AliasFor(annotation = Bean.class,attribute = "name")
    String name() default "";
}
