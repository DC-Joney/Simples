package studentExecse.project.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import studentExecse.project.Customer;
import studentExecse.project.UserManage;

/**
 * Created by Administrator on 2016/9/12.
 */
public class UserManageImpl implements UserManage {
    Logger log= LogManager.getLogger(UserManageImpl.class);
    private final Customer[]customers=new Customer[100];
    int total=1;
    public  UserManageImpl() {
        customers[0]=new Customer(1, "张三", '男', 12, "119", "zhangsan@126.com");
    }

    @Override
    public boolean add(Customer customer) {
        if(total>=customers.length){
            return false;
        }
        customers[total]=customer;
        total++;
        return  true;
    }

    @Override
    public boolean update(int index,Customer customer) {
        int index1=search(index);
        if (index1==-1){
            return  false;
        }else{
            customers[index1]=customer;
            return  true;
        }
    }

    @Override
    public Integer search(int index) {
        for (int i=0;i<total;i++){
            if (index == customers[i].getCustomerNo()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean delete(int index) {
        int index1 = search(index);
        if (index1 == -1) {
            return false;
        } else {
            for (int i = index1; i < total - 1; i++) {
                customers[i] = customers[i + 1];

            }
            customers[total - 1] = null;
            total--;
            return true;
        }
    }

    @Override
    public Customer select(int index) {
        for (int i = 0; i < total; i++) {
            if (index==customers[i].getCustomerNo()) {
                return customers[i];
            }

        }
        return null;
    }

    @Test
    public  void  test(){
        Assert.assertEquals(new UserManageImpl().add(new Customer(1,"aa",'女',23,"13045595","13502@qq.com")),true);
        log.debug(customers.length+ ": "+total);
    }

}
