package studentExecse.method;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/12.
 */
public class TestPassObject {
    public  static  class Boy{
        private String name;

        public Boy(String name) {
            this.name = name;
        }

        public void  marryWith(Gril gril){
            gril.marryWith(this);
        }

    }
    public  static class Gril{

        private String name;
        public Gril(){
        }

        public Gril(String name) {
            this.name = name;
        }

        public  void  marryWith(Boy boy){
            System.out.println(name+" marry with "+boy.name);
        }
    }
    @Test
    public void testMarry(){
        Gril gril=new Gril("王五");
        new Boy("张三").marryWith(gril);
    }
}
