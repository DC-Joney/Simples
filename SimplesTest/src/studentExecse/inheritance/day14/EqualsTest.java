package studentExecse.inheritance.day14;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/14.
 */
public class EqualsTest {
    @Test
    public void equalsTest() {
//        EqualsTest equalsTest = new Equals();
//        System.out.println(Equals.class.isInstance(equalsTest));
          Customer customer=new Customer(1,"aa");
          Customer customer1=new Customer(2,"bb");
        System.out.println(customer.equals(customer1));
//        char s=132;
//        System.out.println(132==s);

    }


}
class Equals extends EqualsTest{

}
class Customer{
    private int id;
    private String name;
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(!Customer.class.isInstance(obj)){
                return false;
        }
        Customer customer= (Customer) obj;
        return this.getName().equals(customer.getName())&&this.getId()==customer.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
//December October
