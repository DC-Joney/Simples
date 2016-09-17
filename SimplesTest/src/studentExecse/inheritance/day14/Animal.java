package studentExecse.inheritance.day14;

/**
 * Created by Administrator on 2016/9/14.
 */
public class Animal {
    public  void  eat(){
        System.out.println("Animal.eat");
    }
    public static void main(String[] args) {
        AnimalTest.eat(new Cat());
    }
}
class  AnimalTest{
    public static  void  eat(Animal animal){
        if (animal instanceof Dog){
            Dog dog=(Dog)animal;
            System.out.println(dog);
        }
        else if (animal instanceof Cat){
            Cat c= (Cat) animal;
            System.out.println(c);
        }
        else if(animal instanceof Duck){
            Duck duck= (Duck) animal;
            System.out.println(duck);
        }
        else {
            System.out.println("类型不匹配");
        }
    }
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog.eat");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
class Duck extends  Animal{
    @Override
    public void eat() {
        System.out.println("Duck.eat");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}


