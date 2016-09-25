import java.util.HashSet;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-24-1:15
 */


public class LinkList<E> {
    private int size=0;
    Node<E> first;
    Node<E>last;
    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public  void addLast(E e){
        linkLast(e);
    }

    private void linkLast(E e) {
        final Node<E> l =last;
        final Node<E> newNode=new Node<E>(l,e,null);
        last=newNode;
        if(l==null){
            first=newNode;
            first.prev=last;
        }
        else{
            l.next=newNode;
            newNode.next=first;
        }
        size++;

    }
    public  Integer size(){
        return size;
    }
    public void print() {
        Node<E> node = first;
        while (node.next != null) {
            System.out.println(node.item);
            node = node.next;
        }
//        if (node.next == null) {
//            System.out.println(node.item);
//        }
    }
    public static void main(String[] args) {
        LinkList<Integer>list=new LinkList<>();
        list.addLast(123);
        list.addLast(455);
        list.addLast(456);
        list.addLast(456);
        list.addLast(457);
        list.addLast(458);
        list.addLast(459);

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(12);
        hashSet.add(12);
        System.out.println(list.size());
        list.print();
       // TreeSet
    }


}
//@FunctionalInterface
//interface  Main<T>{
//    int compare(T o1, T o2);
//    default void test(){
//
//    }
//    public  static  String getString(){
//        return "";
//    }
//}
class Test{
    String name;
    String test;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Test t= (Test) obj;
        if(t.name.equals(name)){
            System.out.println(false);
            return true;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
            Test  test=new Test("123");
            Test  test1=new Test("123");
            Test  test2=new Test("456");
            Test  test3=new Test("789");
            Test  test4=new Test("456");
        Test  test5=new Test("789");Test  test6=new Test("562");

            HashSet<Test> tests=new HashSet<>();
            tests.add(test);
            tests.add(test1);
            tests.add(test3);            tests.add(test2);

        tests.add(test4);
            tests.add(test5);
            tests.add(test6);
            for (Test testI : tests) {
                System.out.println(testI);
            }

    }

}

