package studentExecse.inheritance.day12;

/**
 * Created by Administrator on 2016/9/12.
 *
 * 异构对象集合 用数组模拟的集合
 * 主树枝式 主树干
 * 用final声明类或者是方法的时候 那么该类将不允许被继承或者是 方法不允许重写
 * 1.不能子类化final类
 * 2.不能重写final方法
 * 3.类中的final变量(字段)视为常量
 * 4.空缺的final变量(字段) 必须在构造函数中初始化 如果fianl 在构造函数中初始化了 那么就必须在所有的重载构造函数中进行初始化
 * 5.final变量只能设置一次
 * 6.final变量必须在使用前进行设置
 */

public class PortfolioManager {
    Asset1[] tomAssets = new Asset1[5];
    public void createAsserts(){

        SavingAccount1 tomSavingsAccount = new SavingAccount1();
        tomSavingsAccount.setId(1001);
        tomSavingsAccount.setType("Bank Account");
        tomSavingsAccount.setBankName("Citi bank");
        tomSavingsAccount.setAccountNumber(526702);
        tomSavingsAccount.setBalance(15450.00f);
        tomSavingsAccount.setInteresRate(3.0f);
        tomAssets[0] = tomSavingsAccount;
        CheckAccount1 iVisionBusinessAccount = new CheckAccount1();
        iVisionBusinessAccount.setId(1002);
        iVisionBusinessAccount.setType("Bank Account");
        iVisionBusinessAccount.setBankName("Bank of America");
        iVisionBusinessAccount.setAccountNumber(24689);
        iVisionBusinessAccount.setBalance(678256.00f);
        iVisionBusinessAccount.setOverdraftLimit(50000.00f);
        tomAssets[1] = iVisionBusinessAccount;
        Stock ibmStocks = new Stock();
        ibmStocks.setId(5001);
        ibmStocks.setType("Security");
        ibmStocks.setTardeExChanggeName("NYSE");
        ibmStocks.setSymbol("IBM");
        ibmStocks.setQuantityAtHand(100);
        ibmStocks.setMarketPrice(129.61f);
        tomAssets[2] = ibmStocks;
        Bond aaplBonds = new Bond();
        aaplBonds.setId(6000);
        aaplBonds.setType("Bonds");
        aaplBonds.setTardeExChanggeName("NYSE");
        aaplBonds.setName("Apple Inc");
        aaplBonds.setInvestedAmout(25000.00f);
        aaplBonds.setMaturityDate("01/01/2015");
        tomAssets[3] = aaplBonds;
        RealEstate texasEstate = new RealEstate();
        texasEstate.setId(8000);
        texasEstate.setType("Real Estate");
        texasEstate.setName("House in Texas");
        texasEstate.setBuiltArea(2250);
        texasEstate.setCurrentMarketRate(950.00f);
        tomAssets[4] = texasEstate;
    }
    private void printAllAssets(){
        String lineSeparator = "-------------------";
        System.out.println("Entire Portfolio");
        for (Asset1 asset : tomAssets) {
            System.out.println(lineSeparator);
            asset.printDescription();
        }
        System.out.println(lineSeparator);
    }

    private void printNetWorth() {
        float total = 0;
        for (Asset1 asset : tomAssets) {
            total += asset.getNetWorth();
        }
        System.out.println("Net Worth of Tom's entire portfolio: $" + total);
    }
    public static void main(String[] args) {
//        PortfolioManager manager = new PortfolioManager();
//        manager.createAsserts();
//        manager.printAllAssets();
//        manager.printNetWorth();
    }

}
class  A{
    final int a,b;
//
//    public A() {
//
//    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
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
    public void  printDescription(){
        System.out.println("Asset ID: " + id);
        System.out.println("Asset type: " + type);
    }
    public float getNetWorth() {
        return 0;
    }
}
class BankAccout1 extends Asset1{
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

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("BankAccount Name: " + bankName);
        System.out.printf("BackAccount1 #: %d%n", accountNumber);
        System.out.printf("BackAccount Current balance: $%.02f%n", balance);

    }
    public float getNetWorth(){
        return balance;
    }
}
class SavingAccount1 extends BankAccout1{
    private float interesRate;

    public float getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(float interesRate) {
        this.interesRate = interesRate;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("SavingAccount1");
        System.out.printf("SavingAccount1 Interest rate (%%): %.02f%n" , interesRate);
    }
}
class CheckAccount1 extends BankAccout1{
    private  float  overdraftLimit;

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("CheckingAccount");
        System.out.printf("CheckingAccount Overdraft limit: $%.02f%n", overdraftLimit);
    }
}
class Security extends Asset1{
    private  String tardeExChanggeName;

    public String getTardeExChanggeName() {
        return tardeExChanggeName;
    }

    public void setTardeExChanggeName(String tardeExChanggeName) {
        this.tardeExChanggeName = tardeExChanggeName;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println(" Security Trade Exchange: " + tardeExChanggeName);


    }

}
class Stock extends Security{
    private String symbol;
    private float marketPrice;
    private int quantityAtHand;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getQuantityAtHand() {
        return quantityAtHand;
    }

    public void setQuantityAtHand(int quantityAtHand) {
        this.quantityAtHand = quantityAtHand;
    }

    @Override
    public void printDescription() {
        System.out.println("Stock: Investment in securities");
        super.printDescription();
        System.out.println("Stock: " + symbol);
        System.out.printf(" Stock: Today's market price: $%.02f%n", marketPrice);
        System.out.printf("Stock: Quantity at Hand: %d%n", quantityAtHand);
        System.out.printf("Stock: Net worth: $%.02f%n", marketPrice * quantityAtHand);

    }
    public float getNetWorth() {
        return marketPrice * quantityAtHand;
    }
}
class Bond  extends Security{
   private String name,maturityDate;
    private float investedAmout;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public float getInvestedAmout() {
        return investedAmout;
    }

    public void setInvestedAmout(float investedAmout) {
        this.investedAmout = investedAmout;
    }

    @Override
    public void printDescription() {
        System.out.println("Bond Investments in Bonds");
        super.printDescription();
        System.out.println("Bond name: " + name);
        System.out.printf("Bond Invested Amount: $%.02f%n", investedAmout);
        System.out.println("Bond Maturity Date: " + maturityDate);

    }
    public float getNetWorth() {
        return investedAmout;
    }
}
class RealEstate extends Asset1{
    private String name;
    private float builtArea;
    private float currentMarketRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBuiltArea() {
        return builtArea;
    }

    public void setBuiltArea(float builtArea) {
        this.builtArea = builtArea;
    }

    public float getCurrentMarketRate() {
        return currentMarketRate;
    }

    public void setCurrentMarketRate(float currentMarketRate) {
        this.currentMarketRate = currentMarketRate;
    }

    @Override
    public void printDescription() {
        System.out.println("Real Estate");
        super.printDescription();
        System.out.println("RealEstate Name: " + name);
        System.out.printf("RealEstate Built-up Area: sq.ft. %.02f%n", builtArea);
        System.out.printf("RealEstate Current Market Rate(per sq.ft.): $%.02f%n",
                currentMarketRate);
        System.out.printf("RealEstate Net worth: $%.02f%n",
                +builtArea * currentMarketRate);
    }
    public float getNetWorth() {
        return builtArea * currentMarketRate;
    }
}

