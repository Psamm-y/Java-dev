package Javadev;

import java.util.Scanner;

public class RockPaperScissors {
    private String userChoice;

    public String getUserChoice() {
        return userChoice;
    }

    private int userSelection;
public int getUserSelection(){
        return userSelection;
}
public void setUserSelection(int userSelection) {
        this.userSelection = userSelection;
    }
    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    private String computerChoice;
    public static String showOptions(){
        return "1. Start game\n" +
                "2. How to play"+
                "3. Cancel and exit";
    }
    public static String showHelp(){
        return "\"R\" or \"r\"  => Rock \n" +
                "\"P\" or \"p\"  => Paper \n";
    }
    public static void main (String[] args){
        System.out.println("Welcome to the Rock Paper Scissors game " +
                "Please select from the options below");
        System.out.println(showOptions());
        RockPaperScissors rps = new RockPaperScissors(); // object of class
        Scanner scan = new Scanner(System.in);
        rps.setUserChoice(scan.next()); //user selection received as string

        if (rps.getUserSelection()==1){ //Game starts here!
            String[] options= {"Rock", "Paper", "Scissors"};
            System.out.println("Rock, Paper, Scissors!Please enter your choice");
        }

    }
}
