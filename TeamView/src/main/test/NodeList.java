/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-24-15:55
 */


public class NodeList<E>{

    private static  class Node<E>{
        E data;
        Node<E> next;

        public Node(E data,Node<E> next) {
            this.data = data;
        }
    }
    private Node<E> head;
    private  Node<E> last;
    private  Node<E> other;
    private Integer size=0;

    public NodeList() {
    }
    public NodeList(E data){
        Node<E> node=new Node<E>(data,null);
        head=node;
        last=head;
        size++;
    }
    private boolean isEmpty(){
        return size==0 || head==null;
    }
    public void add(E data){
        Node<E> d=new Node<>(data,null);
        if(isEmpty()){
            head=d;
            last=head;
        }
        else {
            last.next=d;
            last=d;
        }
        size++;
    }
    public Integer size(){
        return size;
    }
    public void print(){
        other=head;
        while(other!=null){
            System.out.println(other.data);
            other=other.next;}
    }


    public static void main(String[] args) {
        NodeList<Integer> list=new NodeList<>(123);
        list.add(456);
        list.add(789);
        list.print();
    }

}
