package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * 抽象演员类
 *
 * @author Joney
 * @create 2016-09-19-9:00
 */


public abstract class Actor {
    public abstract void  play();

    public void eat() {
    }
    public  void add(Actor actor){

    }

    public static void main(String[] args) {
        Actor[]actors=new Actor[2];

    }

}
class Funster extends Actor{
    @Override
    public void play() {
        System.out.println("Funster.play");
    }
}
class FetishActor extends Actor{
    @Override
    public void play() {
        
    }
}
class Compare {
    public void addActor(Actor... actors) {
        for (Actor actor : actors) {
            
        }
    }

}
