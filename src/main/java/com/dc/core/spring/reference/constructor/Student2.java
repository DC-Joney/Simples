package com.dc.core.spring.reference.constructor;

import java.beans.ConstructorProperties;

/**
 * Created by Administrator on 2016/9/8.
 */
public class Student2 {
    private  String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    //@ConstructorProperties({"张三","98"})
    public Student2(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
