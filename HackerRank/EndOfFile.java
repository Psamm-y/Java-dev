package Javadev.HackerRank;

import java.util.Scanner;

public class EndOfFile {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        while(scan.hasNextLine()){
            System.out.println("1 "+ scan.nextLine());
        }
        scan.close();
    }
}


