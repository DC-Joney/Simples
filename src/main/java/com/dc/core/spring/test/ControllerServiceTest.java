package com.dc.core.spring.test;

import com.dc.core.spring.reference.FactoryImpl.dao.FactoryDao;
import com.dc.core.spring.reference.annotation.AnnotaionBean;
import com.dc.core.spring.reference.annotation.MyService;
import com.dc.core.spring.reference.collection.ListCollection;
import com.dc.core.spring.reference.collection.dao.User;
import com.dc.core.spring.reference.constructor.Student1;
import com.dc.core.spring.reference.constructor.Student2;
import com.dc.core.spring.reference.constructor.StudentBean;
import com.dc.core.spring.reference.lazyAndNullAndDepednsOn.Computer;
import com.dc.core.spring.reference.lazyAndNullAndDepednsOn.Lenovo;
import com.dc.core.spring.reference.lazyAndNullAndDepednsOn.Null;
import com.dc.core.spring.reference.setInjection.ParentBean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.*;

/**
 * Created by Administrator on 2016/9/7.
 */
//ctrl+h 查看此类的子类和 接口的实现类
public class ControllerServiceTest {
    Logger log = LogManager.getLogger(ControllerServiceTest.class);

    //    @Autowired
//    @Qualifier("controller")
//    private ControllerService controller;
//    public void setControllerService( ControllerService controller){
//        this.controller=controller;
//
//    }
    @Ignore
    @Test
    public void test() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-StaticFactory.xml"});
        Assert.assertNotNull(ctx.getBean("service"));
        //System.out.println(controller==null);
    }

    @Ignore
    @Test
    public void getFactoryDao() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-FactoryImpl.xml"});
        Assert.assertNotNull(ctx.getBean(FactoryDao.class));
    }


    /**
     * 这个代码运行不起来 包括
     * ConfigurableBeanFactory factory=new DefaultListableBeanFactory();
     * //  factory.setParentBeanFactory(ctx); 添加父类容器 不知道如何添加子类容器
     * 用 AbstractXmlApplicationContext添加父类容器
     */

    @Test
    public void getStudentDao1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-test-parent.xml"});
//        ConfigurableBeanFactory factory=new DefaultListableBeanFactory();
//        factory.setParentBeanFactory(ctx);
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext();
//        //ApplicationContext parent = context.getParent();
        context.setParent(ctx);
        context.setConfigLocation("spring-test.xml");
//
        log.info(context.getParent());
    }

        //factory.setParentBeanFactory(ctx);
//        ConfigurableApplicationContext ctx1=new ClassPathXmlApplicationContext(new String[]{"spring-test.xml"});
//        ctx1.setParent(ctx);
//        ctx1.refresh();
        // ctx.refresh();

        @Ignore
        @Test
        public void getStudentDao(){
            ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"spring-test-parent.xml"});
////        ConfigurableBeanFactory factory=new DefaultListableBeanFactory();
////        factory.setParentBeanFactory(ctx);
//        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("spring-test.xml");
//        //ApplicationContext parent = context.getParent();
//        context.setParent(ctx);
//
//        log.info(context.getParent());

//      factory.setParentBeanFactory(ctx);
//        ConfigurableApplicationContext ctx1=new ClassPathXmlApplicationContext(new String[]{"spring-test.xml"});
//        //ctx1.setParent();
//       // ctx1.refresh();
//        ctx.refresh();

//        System.out.println(ctx1.getBeanFactory().getBean(ParentTree.class));
////
//        factory.s
//
//        System.out.println(factory.getParentBeanFactory().getBean(ParentTree.class));

            //ctx1.refresh();
//        BeanFactory parent = new XmlBeanFactory(new ClassPathResource("spring-test-parent.xml"));
//        BeanFactory bean=new XmlBeanFactory(new ClassPathResource("spring-test.xml"),parent);
//        ChildTree h1= (ChildTree) bean.getBean("helloWorld");
          //  ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-test-parent.xml");
           // ApplicationContext ctx1 = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-test.xml"}, ctx);
           // Assert.assertNotNull(ctx1.getBean(ChildTree.class));
            // Assert.assertNotNull(ctx.getBean(StudentDao.class));
            //Assert.assertNotNull(ctx.getBean(ChildTree.class));

        }
        @Test
        public void getStudentBean(){
            ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-constructor.xml"});
            Assert.assertNotNull(ctx.getBean(Student1.class));
            Assert.assertNotNull(ctx.getBean(Student2.class));
            Assert.assertNotNull(ctx.getBean(StudentBean.class));
            log.info(ctx.getBean(Student1.class).toString());
            Student1 student1 = ctx.getBean(Student1.class);
            Assert.assertNotNull(student1.getStudentId());
            log.info(student1.getAge());
            Student2 student2 = ctx.getBean(Student2.class);
            log.info(student2.getName());

        }

        @Test
        public void getSetInjection(){
            ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-setInjection.xml"});
            Assert.assertNotNull(ctx.getBean("exampleBean"));
            Assert.assertNotNull(ctx.getBean("parentBean"));
            Assert.assertNotNull(ctx.getBean("exampleBean1"));
            Assert.assertNotNull(ctx.getBean(ParentBean.class));
            //Assert.assertNotNull(ctx.getBean(ExampleBean.class));
            Assert.assertNotNull(ctx.getBean("accountService1"));
        }

        /**
         * @author Joney
         * Spring XML文件声明内部bean 直接在IOC容器中获取的话 值为null
         * 必须同过内部bean所在的bean 获取之后 在获取内部bean的属性
         *
         */
        @Test
        public void getAnnotation(){
            ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"spring-collection.xml"});
            Assert.assertNotNull(ctx.getBean(User.class));
            ApplicationContext ctx1 = new FileSystemXmlApplicationContext(new String[]{"classpath:spring-StaticFactory.xml"});
            Assert.assertNotNull(ctx1);
            ListCollection collection = ctx.getBean(ListCollection.class);

            List<User> users = collection.getList();
            for (User user : users) {
                log.info(user.getUserName() + " : " + user.getPassword());
            }
            Properties pros = collection.getProperties();
            Set keyValue = pros.keySet();
            for (Iterator it = keyValue.iterator(); it.hasNext(); ) {
                String key = (String) it.next();
                log.info(key + ":" + pros.getProperty(key));

            }
            Set<?> set = collection.getSet();

            for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
                log.info(iterator.next());
            }
            Map<?, ?> map = collection.getMap();
            for (Map.Entry<?, ?> set1 : map.entrySet()) {
                log.info(set1.getKey());

            }

        }
    @Test
    public  void getNullBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"Null.xml"});
        Assert.assertNotNull(context.getBean(Null.class));
        Assert.assertNotNull(context.getBean(Computer.class));
        Assert.assertNotNull(context.getBean(Lenovo.class));
    }
    @Test
    public  void  getAnnotationBean(){
        ApplicationContext context=new AnnotationConfigApplicationContext(AnnotaionBean.class);
        MyService myService= (MyService) context.getBean("service1");
        Assert.assertNotNull(myService);
        AnnotaionBean bean=context.getBean(AnnotaionBean.class);
      //  bean.s
        log.info(bean.getNumber());
    }
    }





