package com.dc.core.spring.reference.constructor;

/**
 * Created by Administrator on 2016/9/8.
 */
public class Student1 {
    private int studentId;
    private String age;

    public int getStudentId() {
        return studentId;
    }

    public String getAge() {
        return age;
    }

    public Student1(int studentId, String age) {
        this.studentId = studentId;
        this.age = age;
    }

}
