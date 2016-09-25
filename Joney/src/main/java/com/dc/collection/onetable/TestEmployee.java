package com.dc.collection.onetable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-24-19:26
 */
public class TestEmployee {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        TreeSet set=new TreeSet(new Comparator() {
            SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            @Override
            public int compare(Object o1, Object o2) {
                Date date1=null,date2=null;
                try {
                    date1= date.parse(((Employee)o1).getBirthday().toString());
                    date2=date.parse(((Employee)o2).getBirthday().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return date1.getTime()-date2.getTime()>=0?1:-1;
            }
        });
        //赋值
        set.add(new Employee("吴帆",25,new Mydate(1992,8,9)));
        set.add(new Employee("吴百万",24,new Mydate(1992,8,11)));
        set.add(new Employee("吴百万",24,new Mydate(1992,8,8)));


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object object =  iterator.next();
            System.out.println(object);
        }

    }
}
class Mydate {
    private int year,month,day;

    public Mydate() {
    }

    public String getDetail(){
        return year+"-"+month+"-"+day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
}
class Employee{
    private String name;
    private int age;
    private Mydate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" +birthday.getDetail() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, int age, Mydate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }
}
