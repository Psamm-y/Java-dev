
package Javadev.HackerRank;

import java.util.Scanner;

public class StaticInit {
/*Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.*/

static int areaOfParallelogram(int height, int breadth){
    return height*breadth;
}
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int height=scan.nextInt();
        int breadth= scan.nextInt();

        if(height<=0 || breadth<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            System.out.println(areaOfParallelogram(height,breadth));
        }

        scan.close();
    }
}

