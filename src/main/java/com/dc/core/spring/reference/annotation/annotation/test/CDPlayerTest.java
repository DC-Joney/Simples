package com.dc.core.spring.reference.annotation.annotation.test;

import com.dc.core.spring.reference.annotation.annotation.cdplayer.CDPlayerConfig;
import com.dc.core.spring.reference.annotation.annotation.cdplayer.CompactDisc;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by in IntelliJ IDEA.
 * cd播放器测试类
 *
 * @author Joney
 * @create 2016-09-18-23:51
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@SuppressWarnings("InjectedReferences")
public class CDPlayerTest {
    private static Logger log;
    static {
        log= LogManager.getLogger(CDPlayerTest.class);
    }
    @Autowired(required =true)
    @Qualifier("getBean123")
    private CompactDisc cd;
    @Autowired
    @Qualifier("xmlBean1")
    private XmlBean xmlBean2;
    //@Autowired
    //@Qualifier("xmlBean")
   // private XmlBean xmlBean;
//    @Autowired()
//    private MediaPlayer mediaPlayer;
    //@Ignore
    @Test
    public void cdShouldNoBeNull() {
        Assert.assertNotNull(cd);
        log.info(cd);
        cd.display();
        ApplicationContext context=new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    }
//    @Test
//    public  void test(){
//
//        Assert.assertNotNull(mediaPlayer);

//        //Assert.assertNotNull(context.getBean("getBeans"));
//    }
    @Test//(expected = Error.class)
    public void test1() {
        Assert.assertNotNull(cd);
    }
    @Test
    public void getBean() {
        System.out.println(" : "+xmlBean2);
        //com.dc.core.spring.reference.annotation.annotation.test.XmlBean$$EnhancerBySpringCGLIB$$73720b4d@15650ae
    }
}

