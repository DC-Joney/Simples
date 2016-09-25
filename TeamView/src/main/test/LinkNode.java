/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-22-19:09
 */


public class LinkNode {
    Node head=null;
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val=val;
            next = null;
        }
    }
    //添加链表节点
    public void add(int num){
        Node node=new Node(num);
        if(head==null){
            head=node;
        }else {
            search().next=node;
        }
    }
    //查找链表节点
    public Node search(){
        Node nodelast = head;
        while(nodelast.next!=null){
            nodelast = nodelast.next;
        }
        return nodelast;
    }
    //查找链表节点
    public Node search(int num){
        Node nodelast=head;
        while (nodelast.next!=null){
            if(nodelast.next.val==num){
                return nodelast;
            }
            nodelast=nodelast.next;

        }
        return null;
    }
    //打印链表节点
    public void printList() {
        Node cur=head;
        while (cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {

        LinkNode listNode=new LinkNode();
        listNode.add(1);
        listNode.add(2);
        listNode.add(9);
        listNode.add(9);
        listNode.printList();
        System.out.println(listNode.search(2).val);
    }

}
