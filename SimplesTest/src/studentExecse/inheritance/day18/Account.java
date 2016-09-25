package studentExecse.inheritance.day18;

/**
 * Created by in IntelliJ IDEA.
 * 银行账户
 *
 * @author Joney
 * @create 2016-09-18-11:32
 */


public class Account {
    private String userName;
    private String  password;
    private static Integer accountBalance;
    private static final  double  interest_rate=0.26;
    private static Integer minBalance;

    public String getUserName() {        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Integer getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(Integer accountBalance) {
        Account.accountBalance = accountBalance;
    }

    public static double getInterest_rate() {
        return interest_rate;
    }

    public static Integer getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(Integer minBalance) {
        Account.minBalance = minBalance;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
