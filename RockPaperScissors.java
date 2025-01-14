package Javadev;

import java.util.Scanner;

public class RockPaperScissors {
    private String userChoice;

    public String getUserChoice() {
        return userChoice;
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
                "2. Cancel and exit";
    }
    public static void main (String[] args){
        System.out.println("Welcome to the Rock Paper Scissors game " +
                "Please select from the options below");
        System.out.println(showOptions());
        RockPaperScissors rps = new RockPaperScissors(); // object of class
        Scanner scan = new Scanner(System.in);
        rps.setUserChoice(scan.next()); //user selection received as string



    }
}
