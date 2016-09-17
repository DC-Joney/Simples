package com.dc.core.exception.exception.framework;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/12.
 */

public class DataAccessGateway {

    public DataAccessGateway() {
    }

    // TODO: 2016/9/12
    @Test
    public void load() {
        try {
            FileInputStream inputStream = new FileInputStream("E:\\aaa.txt");
        } catch (FileNotFoundException e) {
            throw  new DataAccessException("文件未找到",e);
        }


    }





}
