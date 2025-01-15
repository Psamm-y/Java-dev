package Javadev;

import java.util.Random;
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
                "2. Get Help\n"+
                "3. Cancel and exit";
    }
    public static String showHelp(){
        return "\"R\" or \"r\"  => Rock \n" +
                "\"P\" or \"p\"  => Paper \n" +
                "\"S\" or \"s\"  => Scissors \n";
    }

    public static void main (String[] args){
        System.out.println("Welcome to the Rock Paper Scissors game " +
                "Please select from the options below");
        System.out.println(showOptions());
        Random rand = new Random(); //random object
        RockPaperScissors rps = new RockPaperScissors(); // object of class
        Scanner scan = new Scanner(System.in);
        rps.setUserSelection(scan.nextInt());

        if (rps.getUserSelection()==1){ //Game starts here!
            int rounds=7;
            int userScore=0;
            int compScore=0;
            while(rounds>0){
            String[] options= {"r", "p", "s"};
            int randomIndex =rand.nextInt(options.length); //generate random index form 0 to array length
            rps.setComputerChoice(options[randomIndex]); //set the computer's choice to a random index in the array


            System.out.println("\nRock, Paper, Scissors! Please enter your choice");
            rps.setUserChoice(scan.next()); //trim removes whitespaces

            String userC= rps.getUserChoice();
            char compC= rps.getComputerChoice().charAt(0);



                if (userC.equalsIgnoreCase("r")&&compC=='p'){
                    compScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Paper beats rock. Computer wins\n" +
                            "rounds left: "+(rounds));

                } else if (userC.equalsIgnoreCase("p")&&compC=='r') {
                    userScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Paper beats rock. User wins\n" +
                            "rounds left:"+(rounds));

                } else if (userC.equalsIgnoreCase("r")&&compC=='s') {
                    userScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Rock beats Scissors. User wins\n" +
                            "rounds left: "+(rounds));

                } else if (userC.equalsIgnoreCase("s")&&compC=='r') {
                    compScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Rock beats Scissors. Computer wins\n" +
                            "rounds left: "+(rounds));

                }else if(userC.equalsIgnoreCase("s")&&compC=='p'){
                    userScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Scissors beats paper. User wins\n" +
                            "rounds left: "+(rounds));

                }else if(userC.equalsIgnoreCase("p")&&compC=='s'){
                    compScore++;
                    rounds--;
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Scissors beats paper. Computer wins\n" +
                            "rounds left: "+(rounds));

                }else if(userC.equalsIgnoreCase(String.valueOf(compC))){
                    System.out.println("Computer's choice:"+ rps.getComputerChoice());
                    System.out.println("Tie\n" +
                            "rounds left: "+ (rounds));
                }
                System.out.println("You: "+userScore+"  Computer: "+compScore);
            }
            if(userScore>compScore) {
                System.out.println("\nCongrats! You won!");
            }
                else if(userScore==compScore){
                    System.out.println("Tie");
                }else {
                System.out.println("Computer won!");
            }
        }else if(rps.getUserSelection()==2){
            System.out.println(showHelp());
        } else if (rps.getUserSelection()==3) {
            System.out.println("Game succesfully ended.");
        }else{
            System.out.println("Please enter a valid option");
        }

    }
}
