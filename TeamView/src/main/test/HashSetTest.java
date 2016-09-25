import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-24-11:38
 */


public class HashSetTest{
    public static void main(String[] args) {
        TreeSet<Brid>set=new TreeSet<>(new Comparator<Brid>() {
            @Override
            public int compare(Brid o1, Brid o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set.add(new Brid("aa",12));
        set.add(new Brid("aa",12));
        for (Brid brid : set) {
            System.out.println(brid);
        }
    }


}
class Brid{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Brid(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Brid{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
