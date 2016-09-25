package com.dc.collection.onetable;

import java.text.ParseException;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-23-17:08
 */

/**
 * 单向节点的最后一个节点永远指向null 单向循环节点的尾节点永远指向head节点
 */

public class NodeList {
    Node firstNdoe;
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next=null;
        }
    }

    /**
     *
     * 如果头节点为空则赋值头节点 如果不为空则接受
     * serch()方法返回的尾节点的next节点则等于将要在尾部添加的节点
     */

    public void add(Integer val){
        Node nextNode=new Node(val);
        if(this.firstNdoe==null){
            this.firstNdoe=nextNode;
        }
        else {
        search().next=nextNode;}
    }

    /**
     *
     * @return 获取链表尾部的节点，通过循环遍历拿到尾节点，并且返回
     */

    public Node search(){
        Node node=firstNdoe;
       while(node.next!=null){
            node=node.next;
        }
        return node;
    }

    /**
     * 循环遍历节点如果该节点的val与带入的id相同则返回该node节点
     * @param id
     * @return
     */
    public Node search(Integer id){
        Node nodelast=firstNdoe;
        while(nodelast.next!=null){
            if(nodelast.val==id){
                return nodelast;
            }
            nodelast=nodelast.next;
        }
        return null;
    }
    /**
     *获取链表中的最后一个节点，如果该节点的下一个节点为空的话 则为最后一个节点
    */
    public Node lastName(){
        Node node=firstNdoe;
        while (node.next!=null){
            node=node.next;
        }
        return node;
    }

    /**
     * 如果当前节点的下一个节点的val值与id相等则返回当前节点
     * @param id
     * @return
     */
    public Node searchprevious(Integer id){
        Node nodelast=firstNdoe;
        while(nodelast.next!=null){
            if(nodelast.next.val==id){
                //nodelast=null;
                return nodelast;
            }
            nodelast=nodelast.next;

        }
        return null;
    }
    //拿到该节点之后删除链表中的某一个节点
    public void delete(Integer id){
        if(search(id)!=null){
            searchprevious(id).next=search(id).next;

        }
       // searchprevious(id)=null;
    }

    /**
     * 打印链表时判断语句不能设置为node.next这样会导致尾节点无法遍历与获取
     */
    public void printNode(){
        Node node=firstNdoe;
        while(node!=null){

            System.out.println(node.val);
            node=node.next;
        }

    }
    public static void main(String[] args) throws ParseException {
        NodeList nodeList=new NodeList();
        nodeList.add(3);
        nodeList.add(4);
        nodeList.add(5);
        nodeList.add(6);
        System.out.println(33);
        //nodeList.delete(5);
        System.out.println("LastNode"+nodeList.lastName().val);
        nodeList.printNode();

//        ArrayList<Integer>arrayList=new ArrayList<>();
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.get(1);


        //nodeList.printNode();
        //Date date1=simpleDateFormat.parse("2013-09-23 19:23:58");
        //System.out.println(date.getTime());
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-hh-dd HH:mm:ss");
//        Date date=new Date(1474629900000L);
//        String s1=simpleDateFormat.format(date);
//        System.out.println(s1);
    }
}
