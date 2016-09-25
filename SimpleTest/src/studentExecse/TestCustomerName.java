package studentExecse;

/**
 * Created by Administrator on 2016/9/12.
 */
public class TestCustomerName {


    public interface  DCHelper{
        public  void select();
        public  void  update();
        public  void delete();
        public  void add();
        public  String getName();


    }
    public static class DCHelperImpl implements DCHelper{
        Customer[] customers=new Customer[3];
        public DCHelperImpl(){
            for (int i = 0; i <customers.length ; i++) {
                Customer custoemr=new Customer("张三"+i,"00"+(i+1));
                System.out.println(custoemr);

            }
        }
        @Override
        public void select() {

        }

        @Override
        public void update() {

        }

        @Override
        public void delete() {

        }

        @Override
        public void add() {

        }

        @Override
        public String getName() {
            return null;
        }


    }


    public static void main(String[] args) {
        DCHelper dcHelper=new DCHelperImpl();


    }
}

class  Customer{
    private String name;
    private  String no;

    public Customer() {
    }

    public Customer(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                '}';
    }


}
