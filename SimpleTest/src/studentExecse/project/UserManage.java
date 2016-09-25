package studentExecse.project;

/**
 * Created by Administrator on 2016/9/12.
 */
public interface UserManage {
    public boolean add(Customer customer);
    public  boolean update(int index,Customer cust);
    public  Integer search(int index);
    public boolean delete(int index);
    public  Customer select(int index);
}
