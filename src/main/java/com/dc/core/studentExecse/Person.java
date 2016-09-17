package com.dc.core.studentExecse;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Person {

    private  String name;
    private  Integer integer;
    public Person() {
        this.integer=15;
    }

    public Person(String name, Integer integer) {
        this.name = name;
        this.integer = integer;
    }
    public  static class TrlAngle{
        private  int base;
        private  int hegiht;

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getHegiht() {
            return hegiht;
        }

        public void setHegiht(int hegiht) {
            this.hegiht = hegiht;
        }
    }
    public Integer getArea(TrlAngle angle){
        System.out.println(angle.getBase());
        return angle==null? -1:angle.getBase()*angle.getHegiht()/2;
    }
    public static void main(String[] args) {
//        Person p=new Person();
//        Person p1=new Person("123",456);
//        System.out.println(p.integer +"\n" +p1.integer);
        TrlAngle angle=new TrlAngle();
        angle.setBase(16);
        angle.setHegiht(3);
        System.out.println(new Person().getArea(angle));

        }
}
