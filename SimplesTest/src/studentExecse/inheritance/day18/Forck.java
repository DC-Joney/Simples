package studentExecse.inheritance.day18;

/**
 * Created by in IntelliJ IDEA.
 * 抽象派生
 *
 * @author Joney
 * @create 2016-09-18-18:21
 */


public abstract class Forck {
    private  static  Forck forck;
    public abstract double calcArea();

    public Forck(Forck forck) {
        this.forck=forck;
    }
    public double forckHandle() {
        return forck.calcArea();
        }
    }
class Shirt extends Forck{
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Shirt(Forck forck, Integer size) {
        super(forck);
        this.size = size;
    }

    @Override
    public double calcArea() {
        return size*1.3;
    }
}
