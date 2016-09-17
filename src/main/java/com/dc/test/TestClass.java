package com.dc.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * Created by Administrator on 2016/9/7.
 */
@SpringBootApplication
public class TestClass {
    Logger log= LogManager.getLogger(TestClass.class);

    public static  class Student{
        private   int score=0;
        private      int id=0;
        private      String name="";

        public  int getId() {
            return id;
        }

        public  void setId(int id) {
            this.id = id;
        }

        public  void setName(String name) {
            this.name = name;
        }

        public  String getName() {
            return name;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
    @Test
    public void test(){
        String[] args={"20","30"};
        TestClass testClass =new TestClass();
        log.debug(testClass);
        SpringApplication.run(TestClass.class,args);
    }
    @BeforeClass
    public  static void  testStudent(){
        Student stu=new Student();
        stu.setName("张三");
        stu.setId(1);
        stu.setScore(80);
    }
    @Test(expected = Error.class)
    public void  getStudenrt(){
        Assume.assumeFalse(false);
        System.out.println("flase");
        Assert.assertNotNull(null);
    }

    public static void main(String[] args) {

 }

}
