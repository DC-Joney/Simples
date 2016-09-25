package studentExecse.inheritance;

/**
 * Created by Administrator on 2016/9/12.
 * 多层继承
 * 树干型 多层继承
 */
public class Chain {
    private SavingAccount savingAccount;
    private CheckingAccount checkingAccount;
    private  void  createAssets(){
        savingAccount=new SavingAccount();
        savingAccount.setId(1);
        savingAccount.setTyepe("Bank Account");
        savingAccount.setBankName("Citi bank");
        savingAccount.setBalance(15450.00f);
        savingAccount.setInteresRate(3.0f);
        checkingAccount=new CheckingAccount();
        checkingAccount.setId(1002);
        checkingAccount.setTyepe("Bank Account");
        checkingAccount.setBankName("Bank of America");
        checkingAccount.setAccoutNumber(24689);
        checkingAccount.setBalance(678256.00f);
        checkingAccount.setOverdraftlimit(50000.00f);
    }
    public void printAllAssets(){
        System.out.println("-------------");
        savingAccount.printDescription();
        System.out.println("------------------");
        checkingAccount.printDescription();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Chain chain=new Chain();
        chain.createAssets();
        chain.printAllAssets();

    }

}
class Asset{
    private  int id;
    private  String  tyepe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyepe() {
        return tyepe;
    }

    public void setTyepe(String tyepe) {
        this.tyepe = tyepe;
    }
    public void printDescription(){
        System.out.println("Assert ID:"+id);
        System.out.println("Assert ID:"+this.getId());
        System.out.println("Assert type:"+tyepe);
    }
}
class BankAccount extends  Asset{
    private  String bankName;
    private  int accoutNumber;
    private  float balance;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(int accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Name: " + bankName);
        System.out.println(this.toString());
        System.out.printf("Account #: %d%n", accoutNumber);
        System.out.printf("Current balance : $ %.02f%n",balance);
     }
}
class SavingAccount extends  BankAccount{
        private float interesRate;

        public float getInteresRate() {
            return interesRate;
        }

        public void setInteresRate(float interesRate) {
            this.interesRate = interesRate;
        }

        @Override
        public void printDescription() {
            System.out.println("A savings account");
            super.printDescription();
            System.out.printf("Interest rate (%%): %.02f%n", interesRate);
        }
}
class  CheckingAccount extends  BankAccount{
    private float overdraftlimit;

    public float getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(float overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void printDescription() {

        super.printDescription();
        System.out.printf("Overdraft limit: $%.02f%n", overdraftlimit);
    }
}

