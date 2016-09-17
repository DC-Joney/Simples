package array;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/9.
 */
public class ArrayTest{
    int[][] colum=new int[4][];
    @Test
    public void arrayTest(){
        for (int i=0;i<colum.length;i++){
            colum[i]=new int[i+1];
            for (int j=0;j<colum[i].length;j++){
                colum[i][j]=i+1;
                System.out.print(colum[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }

}
