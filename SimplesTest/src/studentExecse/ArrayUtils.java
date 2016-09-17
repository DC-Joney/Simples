package studentExecse;

/**
 * @author zhangyang
 * Created by Administrator on 2016/9/9.
 */
public class ArrayUtils {
    //测试一个数字是否为偶数
    public boolean isOddNumber(int positive){
        if(positive%2==0){
            return false;
        }
        return true;
    }

    /**
     * @param index sdsds
     * @param arrays aa
     * @return
     */
    public Integer search(int index,int[]arrays){
        for (int i:arrays) {
            if (i==index){
                return  index;
            }
        }
        return -1;
    }
    public void stamp(int[]arrays){
        for (int i:arrays) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new ArrayUtils().search(3,new int[]{1,2,3});
        new ArrayUtils().search(2,new int[]{});
    }
}
