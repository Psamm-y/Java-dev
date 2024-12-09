import org.w3c.dom.ls.LSInput;

import java.util.Arrays;
import java.util.Scanner;


public class Main{

        // Create a fullThrottle() method
        public void fullThrottle() {
            System.out.println("The car is going as fast as it can!");
        }

        // Create a speed() method and add a parameter
        public void speed(int maxSpeed) {
            System.out.println("Max speed is: " + maxSpeed);}


   final static int integer=32;
    String firstName="Samuel";
    public static void main(String[] args) {
/*    char[] array1 = {'A','B','C','D','E'};
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"Kojo","Ama","Adwoa","Opana"} ;
        System.out.println(Arrays.toString(array2));

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        boolean b = input.nextBoolean();
        char c = input.next().charAt(0);
        System.out.println(c);

        int num1=10;
        int num2=20;
        int num3 =30;
        double average=(num1 + num2 + num3) /3;
        System.out.println(average);

        int length=6;
        int breadth=5;
        int area = length*breadth;
        System.out.println(area);*/

      /*  int radius=14;
        final double pie =3.142;

//        double area_of_circle=pie * radius*radius;
double area_of_circle=pie*Math.pow(radius, 2);
        System.out.println(area_of_circle);

        short number=333;
       double answer= number / (double)4;
       System.out.println(answer);

       double number_one=42.3;
       double result=number_one/7;
        System.out.println(result)*/;

       /* Main myobj= new Main();
        System.out.println(myobj.integer);

        primeChecker test = new primeChecker();
        for  (int i=0;i<test.arr.length;i++){
            System.out.println(test.arr[i]);
        }

        myobj.firstName="Ebenezer";
        System.out.println(myobj.firstName);*/


        System.out.println(integer);
        myMethod();

        Main myObj= new Main();
        myObj.myMethod2();
    }



    static void myMethod(){
        System.out.println("Hello World!");
    }
    public void myMethod2(){
        System.out.println("This can only be accessed by creating an object of the class");

        Main car=new Main();

        car.fullThrottle();
        car.speed(32);

    }
}