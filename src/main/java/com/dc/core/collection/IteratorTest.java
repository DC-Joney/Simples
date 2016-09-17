package  com.dc.core.collection;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * 详情见源码
 * Iterator在collection的集合中 都以内部类的方式 带入了Lisr.iterator();
 * Iterator是集合的父接口 树状图
 * ---| Itreable      接口 实现该接口可以使用增强for循环
  *  ---| Collection 描述所有集合共性的接口
   *  ---| List接口     可以有重复元素的集合
    * ---| Set接口     不可以有重复元素的集合
 *public interface Iterable<T>
 *Itreable   该接口仅有一个方法，用于返回集合迭代器对象。
 Iterator<T> iterator() 返回集合的迭代器对象
 LinkedList 在链表中的元素是可重复的
  */
public class IteratorTest {
    Logger log= LogManager.getLogger(IteratorTest.class);
    List<String>list=new ArrayList<String>();
    @Test
    public  void  test(){
        list.add("123");
        list.add("321");
        Map<String, String> map=new HashMap<String, String>(1, (float) 0.75);
        map.put("123","456");
        map.put("123","456");
        Map<String, String> map1=new Hashtable<String, String>(1, (float) 0.75);
        map1.put("123","456");
        map1.put("123","456");
    }
    @Test
    public void iteratorTest(){
        this.test();
        //List<String> collection=new ArrayList<String>();
        List<String> list=new ArrayList<String>(this.list);
        log.info(list.get(1));
        list.add("aa");
        try {
            Assert.assertNotNull(this.list.get(2));
        } catch (RuntimeException e) {
            log.error(e.getMessage());
        }

        Assert.assertNotNull(list.get(2));

    }
    @Test
    public void getInterator(){
        List<String> list=new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        log.info(list);
        //Iterator<String> iterator=list.iterator();
//        while(iterator.hasNext()){
//            String s=iterator.next();
//            log.debug(s);
//        }
        //Assert.assertNotNull(iterator.next());

//        for(Iterator iterator1=list.iterator();iterator.hasNext();){
//            log.debug(iterator.next());
//
//        }
        //用迭代器清空集合
        Collection<String> collection=new ArrayList<String>(list);
        Iterator<String> iterator=collection.iterator();
        while(iterator.hasNext()){
            // 调用remove之前没有调用next是不合法的
            // it.remove();
            // java.lang.IllegalStateException
            log.debug(iterator.next());
            iterator.remove();
            //1.在对集合进行迭代过程中，不允许出现迭代器以外的对元素的操作，因为这样会产生安全隐患，java会抛出异常并发修改异常（ConcurrentModificationException），普通迭代器只支持在迭代过程中的删除动作。
            //2.ConcurrentModificationException: 当一个集合在循环中即使用引用变量操作集合又使用迭代器操作集合对象， 会抛出该异常。
            //collection.add("aa");

        }
        //如果迭代器的指针已经指向了集合的末尾，那么如果再调用next()会返回NoSuchElementException异常
        //log.debug(iterator.next());
        log.debug(collection.isEmpty());
    }


    /**
     * List特有的迭代器ListIterator
     * ---| Iterator
        hasNext()
        next()
        remove()
        ------| ListIterator Iterator子接口 List专属的迭代器
         add(E e)    将指定的元素插入列表（可选操作）。该元素直接插入到 next 返回的下一个元素的前面（如果有）
         void set(E o)   用指定元素替换 next 或 previous 返回的最后一个元素
         hasPrevious()    逆向遍历列表，列表迭代器有多个元素，则返回 true。
         previous()       返回列表中的前一个元素。
     注入MyEnum是内部类，正确的使用方法是

     <util:map id="map" key-type="Constants$MyEnum">
     <entry key="A"><value>1</value></entry>
     <entry key="B"><value>1</value></entry>
     </util:map>
     */
    @Test
    public  void  getListIterator(){
//   Iterator在迭代时，只能对元素进行获取(next())和删除(remove())的操作。
//   对于 Iterator 的子接口ListIterator 在迭代list 集合时，还可以对元素进行添加
//   (add(obj))，修改set(obj)的操作。
        List<String> lists=new ArrayList<String>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        List<String> list=new ArrayList<String>(lists);
        ListIterator<String> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            log.debug(listIterator);
            log.debug(listIterator.next());

            //Arrays.copyOf("This is my aoge");

          //  Ok, I mhere in my lifr you  know  The Scanner is  very good

        }
    }
}
