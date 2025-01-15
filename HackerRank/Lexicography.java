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
        System.out.println(wordSum);
        String[] words= {A,B};
        System.out.println(Arrays.toString(words));

        Arrays.sort(words); //soerting arrays in lexicographical order
        System.out.println(Arrays.toString(words));
        if (words[0]==A){ //checking whether 'A' still retains its position index
            System.out.println("No");
        }else{ //else it's index changed
            System.out.println("Yes");
        }

        System.out.println(A.toUpperCase().charAt(0)+A.substring(1)+" "+B.toUpperCase().charAt(0)+B.substring(1));
    }
}
