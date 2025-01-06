package Javadev;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

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


    public static String showOptions(){
        return "1.Deposit \n" +
                "2.Withdraw \n" +
                "3.Check Balance";
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit was successful");
        System.out.println("Your current balance is "+ balance);
    }

    public void withdraw(int amount){
        balance-=amount;
        System.out.println("Withdrawal successful");
        System.out.println("New balance: "+ balance);
    }
public String checkBalance(){
    return "Your current balance is: "+balance;
}

public static void main( String[] args){
    System.out.println("Welcome to Psammy Bank.\n\n" +
            "Please take a few  moment to register with us");
    System.out.println("1.Register\n" +
            "2.Cancel");
    Scanner scan = new Scanner(System.in);

    int input = scan.nextInt();

    //condition for registration input
    if(input==1){
        System.out.println("Please enter your name: ");
    }else {
        System.out.println("Operation cancelled");
    }

}

}
