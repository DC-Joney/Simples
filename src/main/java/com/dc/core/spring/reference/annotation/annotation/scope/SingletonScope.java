package com.dc.core.spring.reference.annotation.annotation.scope;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-25-15:04
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD,ElementType.TYPE})
@Scope("prototype")
public @interface SingletonScope {
    @AliasFor(annotation = Scope.class)
    ScopedProxyMode proxyMode() default ScopedProxyMode.DEFAULT;
}
