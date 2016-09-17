package com.dc.core.spring.reference.setInjection;

/**
 * Created by Administrator on 2016/9/8.
 */
public class ExampleBean {
    private AnotherBean anotherBean;
    private  YetAnotherBean yetAnotherBean;
    private int i;

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    public void setI(int i) {
        this.i = i;
    }
    public static ExampleBean createBean(AnotherBean anotherBean,
                              YetAnotherBean yetAnotherBean, int i){
        ExampleBean exampleBean=new ExampleBean();

        return exampleBean;
    }
}
