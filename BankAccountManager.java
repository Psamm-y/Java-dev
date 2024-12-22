package Javadev;

public class BankAccountManager {
    private String accountNumber;
    private String accountHolder;
    private int balance;
    private boolean transaction;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isTransaction() {
        return transaction;
    }



    public void BankAccountManager(String accountNumber,String accountHolder,int balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(int amount){
    balance+=amount;
    transaction=true;
    System.out.println("Deposit was successful. Your new balance is: GHc"+balance);
    }

    public void withdraw(int amount){
        balance-=amount;
        transaction=true;
        System.out.println("Withdrawal succesful. Your new balance is: GHc"+balance);
    }
    public static void main(String[] args){

    }
}
