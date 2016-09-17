package com.dc.core.exception.exception.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/12.
 */
public class ClassC {
    public  void read(String filename){
        FileInputStream inputStream=null;
        BaseRuntimeException bre=new BaseRuntimeException();
        try {
            inputStream=new FileInputStream(filename);
        } catch (IOException e) {
            bre.addException(e);
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.getMessage();
                    bre.addException(e);
                }
            }
            if (bre.isThrowRequired()){
                throw  bre;
            }
        }

    }
}
