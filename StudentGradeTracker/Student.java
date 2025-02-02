package Javadev.StudentGradeTracker;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Student {
    private String name;
    private double grade;

    public Student(){

    }
    public Student(String name, double grade){
        setName(name);
        setGrade(grade);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade<0.0){
            throw new IllegalArgumentException("Grade should be greater than zero");
        }
        this.grade = grade;
    }

    public void options(){
        System.out.println("1. Add a Student");
        System.out.println("2. Remove a Student");
        System.out.println("3. Display all students");
        System.out.println("4. Find Average Grade");
        System.out.println("5. Exit");
        System.out.print("Enter your choice:");
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student =new Student();
        GradeTracker gt = new GradeTracker();

        System.out.println("Welcome to the Student Grade Tracker!");

        while (true){
            student.options();
            int userChoice= input.nextInt();

            switch (userChoice){
                case 1:
                    System.out.print("Enter Student name: ");
                    String name = input.nextLine();
                    student.setName(name);
                    System.out.print("Enter Student grade: ");
                    double grade = input.nextDouble();
                    student.setGrade(grade);
                    System.out.println("Adding student...");

                    break;
                case 2:
                    System.out.println("Removing student...");
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
    }

}
