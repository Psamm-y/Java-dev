package Javadev;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GradClass {
    public static void main (String [] args){
       /* Scanner scan= new Scanner(System.in);
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
        }*/

        //Shorthand or
        String [] myArr={"Sam","Opuni", "Appiah", "Fenuku"};
        for (String i : myArr){
            System.out.println(i+ " yhyh");
        }

        //Date and Time package
        LocalTime myInitialTime = LocalTime.now();
        System.out.println("Before formatting: "+ myInitialTime);

        DateTimeFormatter myformattedTime= DateTimeFormatter.ofPattern("hh:mm:ss");

        //Formatting time & Date
        String finalDate = myInitialTime.format(myformattedTime);
        System.out.println(finalDate);

        //Creating an ArrayList object(cars)
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("Lambo");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add(1,"Toyota");

        System.out.println(cars);
        System.out.println(cars.get(3));
        cars.set(3,"Opel");
        System.out.println(cars);
        cars.remove(4);
        System.out.println(cars);
        System.out.println(cars.size());

        //Looping through an ArrayList
        for(String num: cars){
            System.out.println("Car Name: "+num);
        }

        ArrayList<Integer> myInts= new ArrayList<Integer>();
    }
}
