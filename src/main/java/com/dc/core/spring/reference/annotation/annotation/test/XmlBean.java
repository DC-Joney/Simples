package com.dc.core.spring.reference.annotation.annotation.test;

import com.dc.core.spring.reference.annotation.annotation.scope.SingletonScope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by in IntelliJ IDEA.
 * xml测试
 *
 * @author Joney
 * @create 2016-09-20-23:40
 */

@Configuration
@ImportResource("classpath:spring-xmlBean.xml")
@SingletonScope
public class XmlBean {

    static {
        System.out.println("虎视眈眈");
    }


    @Test
    public void getXmlBean() {
        ApplicationContext context=new AnnotationConfigApplicationContext(XmlBean.class);
        System.out.println(context.getBean(XmlBean.class));

    }
}
