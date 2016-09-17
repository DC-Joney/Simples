package studentExecse.inheritance.day13;

/**
 * Created by Administrator on 2016/9/13.
 */
import static java.lang.Math.*;
public class Cylinder extends Circle {
    private double length;

    public Cylinder(double length) {
        super(length);
        this.length=super.getRediua();

    }
    public  double area(){
        return  findArea()*length;
    }

    public static void main(String[] args) {
        Cylinder c=new Cylinder(1);
        System.out.println(c.area());
    }
}

class Circle{
    private double rediua;

    public Circle(double rediua) {
        this.rediua = rediua;

    }

    public double getRediua() {
        return rediua;
    }

    public void setRediua(double rediua) {
        this.rediua = rediua;
    }
    public double findArea(){
        return PI*pow(rediua,2);
    }
}
