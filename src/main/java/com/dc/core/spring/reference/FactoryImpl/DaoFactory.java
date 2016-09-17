package com.dc.core.spring.reference.FactoryImpl;

import com.dc.core.spring.reference.FactoryImpl.dao.FactoryDao;
import com.dc.core.spring.reference.FactoryImpl.dao.daoImpl.FactoryImpl;

/**
 * Created by Administrator on 2016/9/8.
 */
//在自己的工厂返回其他bean
public class DaoFactory {
    public FactoryDao getFactory(){
        return new FactoryImpl();
    }
}
