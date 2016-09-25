package com.dc.core.spring.reference.annotation.annotation.scope;

import com.dc.core.spring.reference.annotation.annotation.cd.BeanAliasFor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-25-15:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SeesionScopeImpl.class)
//@ContextConfiguration
//@Component
@Component
@ComponentScan(basePackages = "com.dc.core.spring.reference.annotation.annotation.scope")
@SuppressWarnings("InjectedReferences")
public class ScopeTest{
    Logger log= LogManager.getLogger(ScopeTest.class);
//    @Autowired
//    @Qualifier("compactDisc123456")
//    private SgtPeppers sss;
//    @Autowired
//    @BeanAliasFor(name = "webApplication")
//    private  WebApplicationContext application;
//    @Autowired
//    private SeesionScopeImpl scope;
//    @Autowired
//    //@Qualifier("scoperImpl1")
//    private SeesionScopeImpl s1;

//    @Autowired
//    private SeesionScopeImpl s2;
    @BeanAliasFor(name = "shabi48499")
    public SgtPeppers getSgtPeppers(){
        return new SgtPeppers();
    }
//    @Autowired
//    @Qualifier("bean111")
//    private SgtPeppers sgt;
    @Test
    public void test() {
       // log.info(sss);
       ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(SeesionScopeImpl.class);
        ApplicationContext context1=new AnnotationConfigApplicationContext(ScopeTest.class);
//        context.setParent(context1);
//        context.refresh();
        //log.warn(Arrays.asList(context1.getBean(SeesionScopeImpl.class)));
        //Assert.assertNotNull(SgtPeppers.class);
       //第一生成的的bean为compactDisc123456 第二个shabi48499 第三个为SgtPepperBean111
        log.info(context.getBean("bean111"));
      // log.info(context.getBean(SeesionScopeImpl.class));
       // Assert.assertNotNull(scope);
        //System.out.printf("00%d",6);
        //System.out.printf("");
        //System.out.printf("12123132123123132");
       // log.error(123);
    }
}
