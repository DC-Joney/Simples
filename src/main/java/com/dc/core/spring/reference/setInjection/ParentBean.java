package com.dc.core.spring.reference.setInjection;

/**
 * Created by Administrator on 2016/9/8.
 */
public class ParentBean {
    private AnotherBean anotherBean;
    private  ExampleBean exampleBean;
    private  int i;
    public ParentBean( ExampleBean exampleBean,int i) {
        this.exampleBean = exampleBean;
        this.i=i;
    }
    public static ExampleBean getExampleBean(AnotherBean bean,YetAnotherBean yetAnotherBean){
        return  new ExampleBean();
    }
}
