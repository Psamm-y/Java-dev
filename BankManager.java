package Javadev;

public class BankManager {
    public BankManager(double balance, double depositamount, String accountHoldername) {
        this.balance = balance;
        this.depositamount = depositamount;
        this.accountHoldername = accountHoldername;
    }

    private double balance;
    private double depositamount;
    private String accountHoldername;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(double depositamount) {
        this.depositamount = depositamount;
    }

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }


    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit was successful");
        System.out.println("Your current balance is "+ balance.);
    }

    public void withdraw(int amount){
        balance-=amount;
        System.out.println("Withdrawal successful");
        System.out.println("New balance: "+ balance);
    }
public String checkBalance(){
    return "Your current balance is: "+balance;
}

public static void 

}
