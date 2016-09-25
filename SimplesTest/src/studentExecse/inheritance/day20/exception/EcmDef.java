package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * 异常处理练习题
 *
 * @author Joney
 * @create 2016-09-21-11:23
 */


public class EcmDef {
    private static Throwable throwable=new Throwable();
    private  static TestException1 th=new TestException1();
    class EcDefException extends Throwable{
        public EcDefException(String message) {
            super(message);
        }

        public EcDefException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    static class TestException1 extends Exception{
        public TestException1() {
            super();
        }

        public TestException1(String message) {
            super(message);
        }

        public TestException1(String message, Throwable cause) {
            super(message, cause);
        }
    }
    Integer divid(String...args){
        int i=1;
        try {
            if(args.length<2){
                throw new ArrayIndexOutOfBoundsException("数据不够");
            }
            for (String arg:args){
                i=i/Integer.parseInt(arg);
                if(Integer.parseInt(arg)<0){
                    throw new EcDefException("负数错误");
                }
            }
        }catch (NumberFormatException e){
            th.initCause(e);
            throwable.addSuppressed(e);
        }catch (ArrayIndexOutOfBoundsException e){
            th.initCause(e);
            throwable.addSuppressed(e);
        }catch (ArithmeticException e){
                th.initCause(e);
                throwable.addSuppressed(e);
        }catch (EcDefException e){
            th.initCause(e);
            throwable.addSuppressed(e);
        }finally {
            System.out.println(throwable.getSuppressed());
            if (throwable.getSuppressed().length>0){
                    for(Throwable t:throwable.getSuppressed()){
                        System.out.println(t.fillInStackTrace());
                    }
               try  {
                    throw  (TestException1)th;
                } catch (Exception throwable1) {
                    th.printStackTrace();
                }
            }
            return i;
        }

    }

    public static void main(String[] args) {
        System.out.println(new EcmDef().divid("8","-9"));
    }
}
