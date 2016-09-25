package studentExecse.inheritance.day20;

/**
 * Created by in IntelliJ IDEA.
 * 九九乘法表、
 *
 * @author Joney
 * @create 2016-09-21-19:06
 */


public class Sout {
    public static void main(String[] args) {
        int j;
        String str="";
        for (int i=1;i<=16;i++){
            str=str+"\t";
        }
        for(int i=1;i<=9;i++){
            System.out.print(str);
            for(j=i;j<=i&&j>=1;j--){
//                if(j==2&&i==4){
//                    System.out.print(" "+j+"*"+i+"="+i*j+"\t");
//                }
//                else if(i<=3&&j!=1){
//                    System.out.print(" "+j+"*"+i+"="+i*j+"\t");
//                } else{
                System.out.print(j+"*"+i+"="+i*j+"\t");
                //}
            }
            //j--;
            if (str.length()>0) {
                str = str.substring(0, str.length() - 2);
            }
            System.out.println();
        }
        System.out.println(str.length());
    }
}
