package com.dc.collection.twotable;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-24-2:00
 */


public class ListLink {
    public static void main(String[] args) {
        Node node=new Node();
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.print();
    }
}

class Node{
    Node first;
    Node last;
    Node previous;
    Object data;
    Node next;
    public Node(){}
    public Node(Object data){
        this.data=data;
    }
    public void add(Object data){
        Node node=new Node();
        if(first==null){
        node.data=data;
        first=node;
        last=node;
            last.next=first;
        first.previous=last;
    }else{
        if(last.next==first){
            last.next=node;
            node.previous=last;
            node.data=data;
            last=node;
            last.next=first;
            first.previous=last;
//            System.out.println(first.previous);
//            System.out.println(first.next.data);
//            System.out.println(last.previous.data);
//            System.out.println(last.data);
//            System.out.println(last.next);
        }
        }

    }
    public void print(){
        Node node=last;
        while ((node.previous!=null)) {
                 System.out.println(node.data);
                node = node.previous;
        }
        if (node.previous==null) {
            System.out.println(first.data);

        }
    }
}
