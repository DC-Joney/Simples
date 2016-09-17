package com.dc.core.spring.test.demo;

/**
 * Created by Administrator on 2016/9/8.
 */
public class StudentFactory {
    public  static StudentDao getStudentDao(){
        return  new StudentImpl();
    }

}
