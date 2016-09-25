package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * 测试、
 *
 * @author Joney
 * @create 2016-09-19-16:56
 */


public class Test1 {
    private static Dao dao;
    public static  Dao  getDao(){
        if (dao==null){
            dao=new DaoImpl();
            return dao;
        }
        return dao;
    }
    @org.junit.Test
    public void test() {
        Dao d=getDao();
        Dao d1=getDao();
        System.out.println(d==d1);
    }
}
interface  Dao{

}
class DaoImpl implements Dao{

}
