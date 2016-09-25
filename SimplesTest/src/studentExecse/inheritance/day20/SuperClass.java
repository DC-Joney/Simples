package studentExecse.inheritance.day20;

import javax.validation.constraints.NotNull;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @SafeVarargs注解
 * @create 2016-09-20-15:23
 */


public class SuperClass {

    public SuperClass() {

    }
    //@Test
    @NotNull(message="nullweqewqe",groups = {NullPointerException.class,SuperClass.class})
    public String test() {
        String path="11";
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }


    }

