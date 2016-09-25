package com.dc.core.spring.reference.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * Created by in IntelliJ IDEA.
 * 基于注解配置的bean
 *
 * @author Joney
 * @create 2016-09-18-19:46
 */

@Configuration
@ImportResource("classpath:spring-annotationBean.xml")
@ComponentScan(basePackages = "com.dc.core.spring")
public class AnnotaionBean {


    private Integer number;

    private MyService service;
    private MyService service1;
    @Bean

    //@Primary 设置bean的优先级
    public MyService getFirstMyService(){
            return new MyService();
        }

    @Bean
    @Qualifier("secondService")
    public MyService getSecondService(){
            return new MyService();
        }
    //@Required
//    @Autowired
//    public void  setService1(MyService service1){
//        this.service1=service1;
//    }
    @Value(value = "123")
    public void setNumber(Integer number){
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }

}
