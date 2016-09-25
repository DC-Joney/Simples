package studentExecse.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-23-10:36
 */
//ArraysList 在remove数据时会造成索引紊乱
//在声明ArraysList集合时 在知道大概数据时 尽量为其声明初始长度大小 耗费时间较短 占用内存较小

//如果不为其声明初始长度 底部就会默认运用System.copyof 来转换数组 耗费时间比较长 占用内存较大
//vector是线程不安全的效率比较低
// arraylist 是线程安全的 效率比较高

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<Integer>collection=new ArrayList();
        for(int i=0;i<12;i++){
            collection.add(i);
        }


        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("dd");
        arrayList.add("ee");
        String obj="dd";
        Iterator<String> iterator=arrayList.iterator();

        while(iterator.hasNext()) {
            arrayList.size();
            iterator.next();
            iterator.remove();
            //iterator.next();
//            if (obj.equals("dd")) {
//                iterator.remove();
//            }
           // Queue
            System.out.println(Arrays.asList(iterator.next()));
        }
//        System.out.println(Arrays.asList(collection));
//        System.out.println(collection.size());
//        //System.out.println(((ArrayList)collection).get(3));
//        System.out.println(collection.isEmpty());
//        Collection<?>collection1=new ArrayList(collection);
        //Map<?,?> map=new HashMap<>();

    }
}

class C{
    protected  transient   int  c=5;

}
class D extends C{
    public D(){

    }
    public void show(){
        System.out.println(c);
    }

}
