package Javadev.HackerRank;

import java.util.Scanner;

public class TimesTable {

    public static void main (String[] args){

        //multiplication table
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number to be used the table");
        int userInput= scan.nextInt();
        for(int i=userInput;i <= userInput;i++){
            for (int j=1;j<=10;j++){
                int result=i*j;
                System.out.println(i+" x "+j+" = " +result);
            }
        }
    }

}
