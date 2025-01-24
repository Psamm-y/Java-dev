package Javadev;

import java.util.Scanner;

public class GradClass {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your overall grades in percentage: ");
        double marks= scan.nextDouble();

        if(marks>=90&&marks<=100){
            System.out.println("You're a first class student");
        }

    }
}
