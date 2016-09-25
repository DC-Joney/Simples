package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-19-11:48
 */
public interface English
{
    void learnEnglish();
}
interface Swim{
    void swiming();
}
abstract  class Runner{
    abstract void run();
}
abstract class Student{
    abstract void study();
}
class Hoopman extends Runner{
    @Override
    void run() {
        System.out.println("Hoopman.run");
    }
}
class Hurdleman extends Runner implements English{
    @Override
    void run() {
        System.out.println("Hurdleman.run");

    }

    @Override
    public void learnEnglish() {
        System.out.println("Hurdleman.learnEnglish");
    }
}
class CollegeStudent extends Student implements Swim,English{
    @Override
    void study() {
        System.out.println("CollegeStudent.study");
    }

    @Override
    public void swiming() {
        System.out.println("CollegeStudent.swiming");
    }

    @Override
    public void learnEnglish() {
        System.out.println("CollegeStudent.learnEnglish");
    }
}
class MiddleSchoolStudent extends Student{
    @Override
    void study() {
        System.out.println("MiddleSchoolStudent.study");
    }
}