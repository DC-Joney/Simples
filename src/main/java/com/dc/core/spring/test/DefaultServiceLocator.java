package com.dc.core.spring.test;

import com.dc.core.spring.reference.staticFactory.dao.ControllerService;
import com.dc.core.spring.reference.staticFactory.dao.daoImpl.ControlellrServiceImpl;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/7.
 */
public class DefaultServiceLocator {
    private  static ControllerService service=new ControlellrServiceImpl();

    //private  static
@Test
    public void  test(){
    System.out.println((Integer)129==(Integer) 129);
}
}
