package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * ${DESCRIPTION}
 *
 * @author Joney
 * @create 2016-09-19-14:21
 */
public interface Stop {
    void stop();

}
interface Start extends Stop{
    void start();
}
interface RunMan extends Start{
    void run();
}
class Person implements RunMan{
    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }
}
class Brid implements RunMan{
    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }
}
class car implements RunMan{
    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }
}