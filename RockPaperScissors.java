package Javadev;

public class RockPaperScissors {
    private String userChoice;
    private String computerChoice;
    public static String showOptions(){
        return "1. Start game\n" +
                "2. Cancel and exit";
    }
    public static void main (String[] args){
        System.out.println("Welcome to the Rock Paper Scissors game " +
                "Please select from the options below");

    }
}
