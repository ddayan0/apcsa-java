public class BankAccount {
    private double balance;
    private int accountNum;
    private  static int totalaccounts = 0;
    public BankAccount(){
        this.accountNum = totalaccounts;
        totalaccounts++;
        this.balance = 0;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getAccountNum(){
        return this.accountNum;
    }
    public int getTotalaccounts(){
        return totalaccounts;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
