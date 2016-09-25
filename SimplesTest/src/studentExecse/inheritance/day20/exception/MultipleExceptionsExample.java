package studentExecse.inheritance.day20.exception;


import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


/**
 * Created by in IntelliJ IDEA.
 * io流异常处理
 *
 * @author Joney
 * @create 2016-09-20-18:40
 */


public class MultipleExceptionsExample {

    @Ignore
    @Test
    public void test() {
    Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();

    }

    public static void main(String[] args) {
        String urlStr = null;
        while (true) {
            try {
                System.out.print("Enter url: ");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));
                urlStr = reader.readLine();
                if (urlStr.length() == 0) {
                    System.out.println("No url specified:");
                    continue;
                }
                System.out.println("Opening " + urlStr);
                URL url = new URL(urlStr);
                reader = new BufferedReader(new InputStreamReader(
                        url.openStream()));
                System.out.println(reader.readLine());
                reader.close();
            } catch (MalformedURLException e) {
                System.out.println("Invalid URL " + urlStr + ": "
                        + e.getMessage());
            } catch (IOException e) {
                System.out.println("Unable to execute " + urlStr + ": "
                        + e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
