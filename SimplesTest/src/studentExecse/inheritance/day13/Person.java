package studentExecse.inheritance.day13;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Person {
    private  String name;
    private String  age;
    public Person(){

    }
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String say() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Person p=new Person("张三","118");
        Student student=new Student("张三","118",118,596);
        System.out.println(p.say());
        System.out.println(student.say());


    }

}
class Student extends Person{
    private int id;
    private int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, String age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"\n"+"Student{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }
}

