package studentExecse;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Account {
    private String name;
    private  Integer price;
    private String password;

    public Account(String name, Integer price, String password) {
        this.name = name;
        this.price = price;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if (!(price>20)){
            System.out.println("对不起金额不足");
        }
        this.price =price;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!(password.length()==4)){
            System.out.println("对不起输入不正确");
            return;
        }
        this.password = password;
    }

    public static void main(String[] args) {
        Account account=new Account("Joney",10,"123");
       String name= account.getName();
        Integer price= account.getPrice();
        String passworld=account.getPassword();
        System.out.println(name+" : "+price+ ": "+passworld);
        account.setPassword("123");
    }
}
