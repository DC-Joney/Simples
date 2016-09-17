package com.dc.core.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/12.
 */


public class DataAccessGateway {

    public  void  load(){
        try {
            FileInputStream fiput = new FileInputStream("");
        } catch (IOException e) {
            throw  new DataAccessException();
        }

    }

}
