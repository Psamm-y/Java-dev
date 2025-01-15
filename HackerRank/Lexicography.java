package Javadev.HackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lexicography {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String A= scan.next();
        String B= scan.next();
        int wordSum= A.length()+B.length();

        String[] words= {A,B};

        Arrays.sort(words);
        if (words[0]==A){
            System.out.println("No");
        }else{
            
        }
    }
}
