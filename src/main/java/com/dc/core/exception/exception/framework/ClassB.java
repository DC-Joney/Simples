package com.dc.core.exception.exception.framework;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/12.
 */
public class ClassB {
    @Test
    public void blob(){
        ClassC c=new ClassC();
        c.read("E:\\aaa.txt");
    }
}
