package com.dc.core.spring.reference.staticFactory;

/**
 * Created by Administrator on 2016/9/7.
 */

/**
 * 在自己的静态工厂类中注入自己的bean
 */
public class ClientService {
    private  static ClientService service=new ClientService();
    private ClientService(){

    }
    private static ClientService getService(){
        return service;
    }
}
