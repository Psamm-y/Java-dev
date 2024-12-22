package Javadev;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankAccountManager {
    private String accountNumber;
    private String accountHolder;
    private double balance=0;
    private boolean transaction;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isTransaction() {
        return transaction;
    }



    public void BankAccountManager(String accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void deposit(double amount){
    balance+=amount;
    transaction=true;
    System.out.println("Deposit was successful. Your new balance is: GHc"+balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transaction = true;
            System.out.println("Withdrawal succesful. Your new balance is: GHc" + balance);
        }else{
            transaction=false;
            System.out.println("Withdrawal denied");
        }
    }

    public String checkBalance(){
        return "Your current balance is: "+ balance;
    }

    public static String options(){
        return "1.Deposit\n"+
                "2.Withdraw\n"+
                "3.Check Balance";
    }
    public static void main(String[] args){
        BankAccountManager bank= new BankAccountManager();
        Scanner scan=new Scanner(System.in);
        int userChoice;
        double amount=0;
        System.out.println("Welcome to your banking system!\n" +
                "Please choose from the options below");
        System.out.println(options());
        userChoice=scan.nextInt();
        if(userChoice==1){
            System.out.println("Please enter the amount you want to deposit");
            amount=scan.nextDouble();
            bank.deposit(amount);
        }else if (userChoice==2){
            System.out.println("Please enter the amount you want to withdraw");
            amount=scan.nextDouble();
        }

    }
}
