package Javadev;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BankManager {
    public BankManager(double balance, double depositamount, String accountHoldername,String email) {
        this.balance = balance;
        this.depositamount = depositamount;
        this.accountHoldername = accountHoldername;
        this.email=email;
    }

    private double balance;
    private double depositamount;
    private String accountHoldername;
    private String email;


    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
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


    public static String showOptions() {
        return "1.Deposit \n" +
                "2.Withdraw \n" +
                "3.Check Balance";
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit was successful");
        System.out.println("Your current balance is " + getBalance());
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("New balance: " + balance);
    }

    public String checkBalance() {
        return "Your current balance is: " + balance;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to Psammy Bank.\n\n" +
                "Please take a few moment to register with us");
        System.out.println("1.Register\n" +
                "2.Cancel");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);
        BankManager bank = null;


        int userInput = Integer.parseInt(bf.readLine());


        //condition for registration input
        if (userInput == 1) {
            System.out.println("Please enter first name: ");
            String fname = bf.readLine();

            System.out.println("Please enter last name: ");
            String lname = bf.readLine();

            String name = fname+" "+ lname;

            bank=new BankManager(0.0,0.0,name,null);
            System.out.println("Please input your email");
            String email=bf.readLine();
            bank.setEmail(email);

            System.out.println("First part of registration completed! " +
                    "Welcome "+ bank.getAccountHoldername());

            System.out.println("Please continue to complete your registration \n");
            System.out.println("As part of your registration, you're supposed to deposit \n" +
                    "an amount of not less than GH₵5. \n"+
            "Enter 1 to continue or \n0 to cancel");
            userInput=Integer.parseInt(bf.readLine()); //convert input from user(String) to int

            System.out.println(bank.balance);


            //condition to process deposit or not
            if (userInput==1){

                int attempts =0;
                while (attempts<3){ //user can try again 3 times
                    System.out.println("Enter amount to deposit");
                    double amount= Double.parseDouble(bf.readLine());

                    if(amount>=5){
                        bank.deposit(amount);
                        System.out.println("Registration complete! What do you wanna do?");

                        break;
                    } else {
                        System.out.println("Amount cannot be less than GH₵5");
                    }
                    attempts++;
                }
            }else{
                System.out.println("Operation cancelled");
            }
        } else {
            System.out.println("Operation cancelled");
        }
        while(true) {
            if (bank != null && bank.getBalance() != 0.0) { //condition to check if user has registered to continue
                System.out.println(showOptions());
                userInput = Integer.parseInt(bf.readLine());

                if (userInput == 1) { //if user is registered,they can deposit
                    System.out.println("Please enter the amount you'd want to deposit: ");
                    double dAmount = Double.parseDouble(bf.readLine());
                    bank.deposit(dAmount);

                } else if (userInput == 2) { //if user is registered and there's enough in their account
                    System.out.println("How much do you want to withdraw?");
                    double wAmount = Double.parseDouble(bf.readLine());
                    for (int i = 1; i <= 3; i++) {
                        if (bank.getBalance() >= wAmount) {
                            bank.withdraw(wAmount);
                            break;
                        } else {
                            System.out.println("Your current balance is: " + bank.getBalance() + " Please withdraw a lesser amount");
                            wAmount=Double.parseDouble(bf.readLine());
                        }
                    }

                }
                System.out.println("Is there anything else you'd want to do [Y/N]");
                String userChoice = bf.readLine().trim();
                if (userChoice.equalsIgnoreCase("y")) {
                } else {
                    break;
                }
            }
        }
        bf.close();

    }

}
