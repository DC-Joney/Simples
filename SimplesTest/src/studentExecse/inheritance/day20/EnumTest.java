package studentExecse.inheritance.day20;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import studentExecse.inheritance.NotBeanNull;

import java.util.LinkedList;

/**
 * Created by in IntelliJ IDEA.
 * 枚举类型
 *
 * @author Joney
 * @create 2016-09-20-11:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ComponentScan
public class EnumTest {
    Logger log= LogManager.getLogger(EnumTest.class);
    @Deprecated
    @NotBeanNull
    public void test1() {
           try{
               int[]a=new int[3];a[3]=0;
           }
           catch (ArrayIndexOutOfBoundsException e){
               throw new NullPointerException("空指针异常");
           }
    }

    @Test
    public void test(){
        //@RunListener.ThreadSafe
        LinkedList<Year> list=new LinkedList<>();
        for (Year year : Year.values()) {
            System.out.println(year);
            list.add(year);
            test1();



        }
        System.out.println( list.get(0).compareTo(list.get(0)));
        System.out.println(list.get(0).name());
        //@Repeatable(Schedules.class)
        String name;
        test1();
    }
}
enum  Year{
        SPRING("spring",3),
        SUMMER("summer",6);
private final String name;
private final int mouth;

        Year(String name, int mouth) {
        this.name = name;
        this.mouth = mouth;
        }

        }
