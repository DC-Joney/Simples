package studentExecse;

/**
 * Created by Administrator on 2016/9/10.
 */
public class PersentParent {
    private String name;
    private  Integer age;
    private  String school;
    private  Integer major;

    public PersentParent(String name){
        this(name,0);
    }
    public  PersentParent(String name,Integer school){
        this(name,school,null,0);

    }
    public  PersentParent(String name,Integer age,String school){
        this(name,age,school,0);
    }
    public PersentParent(String name, Integer age, String school, Integer major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public static void main(String[] args) {
        PersentParent parent=new PersentParent("李四",56);
        System.out.println(parent.name+" : "+parent.age);
    }
}
