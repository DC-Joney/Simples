package com.dc.core.studentExecse;

import com.dc.core.spring.reference.collection.dao.User;

/**
 * Created by Administrator on 2016/9/9.
 */
// jdb jstack jstat jstad java-rmi javaws xjc jdeps
public class Calc {
    public  void  test(User a){
        a.setPassword("123");
    }
    public void crtile(String s){
        System.out.println("This is String");
    }
    public void  crtile(Object obj){
        System.out.println("This is Ob");
    }

    public static void main(String[] args) {
        User u=new User();
        new Calc().test(u);
        System.out.println(u.getPassword());
    }

}
