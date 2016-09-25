package studentExecse.inheritance;

/**
 * Created by Administrator on 2016/9/12.
 */

public class PortfolioManager {
}
class Asset1{
    private  int id;
    private  String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class BankAccout extends Asset1{
    private  String bankName;
    private int accountNumber;
    private float balance;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
class SavingAccount1 extends BankAccount{
    private float interesRate;

    public float getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(float interesRate) {
        this.interesRate = interesRate;
    }
}
class CheckAccount extends BankAccount{
    private  float  overdraftLimit;

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
class Security extends Asset1{

}