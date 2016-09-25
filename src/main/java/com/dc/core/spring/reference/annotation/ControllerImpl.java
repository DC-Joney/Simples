package com.dc.core.spring.reference.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by in IntelliJ IDEA.
 * Contrller控制层
 *
 * @author Joney
 * @create 2016-09-18-21:05
 */
@Configuration
@Controller
public class ControllerImpl {
    @Autowired
    private MyService myService;

    @Bean
    public MyService getMyService() {
        return myService;
    }
    @Test
    public void test() {
        Assert.assertNotNull(myService);
    }
}
