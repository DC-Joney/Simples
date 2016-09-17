package com.dc.core.spring.reference.staticFactory;

import com.dc.core.spring.reference.staticFactory.dao.ControllerService;
import com.dc.core.spring.reference.staticFactory.dao.daoImpl.AccountServiceImpl;
import com.dc.core.spring.reference.staticFactory.dao.daoImpl.ControlellrServiceImpl;

/**
 * Created by Administrator on 2016/9/7.
 */

/**
 * 在自己的静态工厂中注入其他类型bean
 */
public class DefaultServiceFactory {
    private static ControllerService service=new ControlellrServiceImpl();
    private static ControllerService service1=new AccountServiceImpl();
    private   DefaultServiceFactory(){}
    public  ControllerService getControllerService(){
        return  service;
    }
    public ControllerService getAccountService(){
        return service1;
    }
}
