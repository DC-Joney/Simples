package com.dc.core.spring.test;

import com.dc.core.spring.reference.staticFactory.ClientService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/9/7.
 */
public class Demo1 {
    Logger log= LogManager.getLogger(Demo1.class);
    @Test
    public  void  getBean(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});

        Assert.assertNotNull(ctx.getBean(ClientService.class));

    }
}
