package com.dc.core.spring.reference.FactoryImpl;

import com.dc.core.spring.reference.FactoryImpl.dao.FactoryDao;

/**
 * Created by Administrator on 2016/9/8.
 */
//根据在DaoFactory 工厂中返回的bean 直接ref到当前的FactoryDao这个bean中
public class SpringAction {
    private FactoryDao factoryDao;
    public void factoryOk(){
        factoryDao.saveFacoyr();
    }

    public void setFactoryDao(FactoryDao factoryDao) {
        this.factoryDao = factoryDao;
    }
}
