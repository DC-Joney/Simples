package com.dc.core.spring.reference.annotation.annotation.scope;

import com.dc.core.spring.reference.annotation.annotation.cd.BeanAliasFor;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-25-14:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeTest.class)
//@Configuration
@ComponentScan(basePackages = "com.dc.core.spring.reference.annotation.annotation.scope")
@Component
@SingletonScope
public class SeesionScopeImpl {
    private String s;
    //@Lazy
    @BeanAliasFor(name = "bean111")
    public SgtPeppers getSeesion(){
        return new SgtPeppers();
    }
    
    public SeesionScopeImpl(String str){
        this.s=str;
    }
    @Bean
    @Lazy
    @Constructor(name = "")
    public SpringApplication getbuilder() {
        return new SpringApplication();
    }
    @Autowired
    private ApplicationContext context;
    @Test
    public void wrong() {
        Assert.assertNotNull(context.getBean(SpringApplication.class));
    }




}
