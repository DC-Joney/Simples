package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * exception
 *
 * @author Joney
 * @create 2016-09-21-10:07
 */

@SuppressWarnings("uncheckd")
public class Tourist {
    class TooColdException extends Exception{
        public TooColdException(String message) {
            super(message);
        }
    }
    class TooHotException extends Exception{
        public TooHotException(String message) {
            super(message);
        }
    }
    void takeTour() throws TooHotException, TooColdException {
        int temperature=(int)(Math.random()*100);
        System.out.println("temperature="+temperature);
        if(temperature>60){
            throw new TooHotException("Too not here");
        }
        else if (temperature<10){
            throw new TooColdException("Tool cold here");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Tourist person=new Tourist();
            try{

                person.takeTour();
                    System.out.printf(
                            "Tourist %d say: This is cool%n", i + 1);

            }
             catch (TooHotException e) {
                System.out.printf(
                        "Tourist %d say: %s%n", i + 1, e.fillInStackTrace());
                    e.printStackTrace();
                continue;
            } catch (TooColdException e) {
                System.out.printf(
                        "Tourist %d say: %s%n", i + 1, e.fillInStackTrace());
                e.printStackTrace();
                continue;
            }finally {
                System.out.println("finally");
            }
        }
    }


}
