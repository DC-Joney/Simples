package studentExecse.inheritance;

import org.springframework.core.annotation.AliasFor;

import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-20-14:43
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@NotNull

public @interface NotBeanNull {
    @AliasFor(annotation = NotNull.class,attribute = "message")
    String name() default "";
}
