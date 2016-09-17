package studentExecse.inheritance.day14;

/**
 * Created by Administrator on 2016/9/14.
 */
public class TestPloyArray1 {
    public static void main(String[] args) {
        Person[]  pers = new Person[6];
        pers[0] =new Person("赵敏",18);
        pers[1] =new Student("八戒",20,80);
        pers[2] =new Student("悟空",600,100);

        pers[3] =new Teacher("唐僧",40,1000);

        pers[4] =new Teacher("如来",4000,2000);
        pers[5] =new Teacher("如来",20,2000);
        int age=pers[0].getAge();
        for(int i=0;i<pers.length;i++){
            if(age<pers[i].getAge()){
                age=pers[i].getAge();


            }
        }
        System.out.println(age);
        for (int i = 0; i <pers.length ; i++) {
            for(int j=0;j<pers.length-1-i;j++){
                if(pers[j].getAge()>pers[j+1].getAge()){
                        Person p=pers[j];
                        pers[j]=pers[j+1];
                        pers[j+1]=p;
                }
            }
        }
        for (Person per : pers) {
            System.out.println(per.getAge());
        }
        for (Person per : pers) {
                if(per instanceof Student){
                    ((Student) per).study();
                }
                else if(per instanceof Teacher){
                    ((Teacher) per).teach();
                }
                else {
                    System.out.println(per.toString());
                }



        }
    }

}
class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public void study(){
        System.out.println("Student.study");
    }
}
class Teacher extends Person{
    private double salary;


    public Teacher(String name, int age,int salary) {
        super(name, age);
        this.salary=salary;
    }
    public void teach(){
        System.out.println("Teacher.teach");

    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}