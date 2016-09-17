package studentExecse.inheritance.day13;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDetails(){
        return getDetails();
    }
}
class PC extends Computer{
    private  String  name;
    private double price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" : "+getName()+"\t"+getPrice();
    }

}