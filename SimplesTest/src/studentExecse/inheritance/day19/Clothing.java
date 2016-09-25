package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * Clothing主接口
 *
 * @author Joney
 * @create 2016-09-19-14:50
 */


public interface Clothing {
    void calcArea();
    void getColor();
    void getDetails();
}
class Shirt implements Clothing{
    @Override
    public void calcArea() {
        System.out.println("Shirt.calcArea");
    }

    @Override
    public void getColor() {
        System.out.println("Shirt.getColor");
    }

    @Override
    public void getDetails() {
        System.out.println("Shirt.getDetails");
    }

}
class TestShirt{
    Clothing clothing1=new Shirt();
    Clothing clothing=new Clothing() {
        @Override
        public void calcArea() {

        }

        @Override
        public void getColor() {

        }

        @Override
        public void getDetails() {

        }
    };

}
