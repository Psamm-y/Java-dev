package Javadev;

import java.util.Scanner;

public class GradClass {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter CGpa: ");
        double gpa= scan.nextDouble();

        if(gpa>=3.6&&gpa<=4.00){
            System.out.println("You're a first class student");
        }else if(gpa>=3.00&&gpa<3.6){
            System.out.println("You're a second class upper student");
        } else if (gpa>=2.5&&gpa<3.00) {
            System.out.println("You're a second class lower class student");
        }else if (gpa>=2.00&&gpa<3.00){
            System.out.println("You're a third class student");
        } else if (gpa>=1.50&&gpa<2.00) {
            System.out.println("Fourth class deeper");
        }else{
            System.out.println("You should've definitely stayed at home");
        }

    }
}
