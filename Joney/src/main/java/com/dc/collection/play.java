package com.dc.collection;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-23-21:09
 */


public class play {
    public static void main(String[] args) {
        LinkedList  list = new LinkedList();
        list.add(new music("当我老了","不知道",100023));
        list.add(new music("单身情歌","林志炫",200033));
        list.add(new music("无情的情书","张杰",400037));
        list.add(new music("我们都一样","张杰",400037));
        System.out.println(Arrays.asList(list));LinkedList list1=new LinkedList(list);
        music mu;int i=0;;
        String str="单身情歌";
        for (Object object1 : list1) {
            music m = (music)object1;
            if (list1.indexOf(m.getName().equals(str)?m:null)>0) {
                //System.out.println(m);
                i=list1.indexOf(m.getName().equals(str)?m:null);
                //mu=m.getName().equals("单身情歌")?m:null;
                list1.remove(i);

            }


        }

//		Iterator ite= list.iterator();
//		while (ite.hasNext()) {
//			Object next = ite.next();
//			System.out.println(next);
//
//		}

//		list.addFirst(new music("小苹果","筷子兄弟",60000));
//		for (Object object : list) {
//			System.err.println(object);
//
//		}

        //list.remove(i);
        System.out.println(Arrays.asList(list));


    }


}
class music{
    private String name;
    private String singer;
    private int time;
    public String toString() {
        return "《"+name+"》\t"+formatTime();
    }
    SimpleDateFormat s = new SimpleDateFormat();

    public String formatTime(){
        int a =time/1000;
        int b = time%1000; //格式化后的毫秒数
        int c =a%60;    //格式化后的秒数
        int d = a/60;       //格式化后的分钟数

        return "0"+d+":"+c+":"+b;


    }
    public music(String name, String singer, int time) {
        super();
        this.name = name;
        this.singer = singer;
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public double getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }



}