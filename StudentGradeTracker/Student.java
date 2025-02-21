package Javadev.StudentGradeTracker;


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
        System.out.println("\n1. Add a Student");
        System.out.println("2. Remove a Student");
        System.out.println("3. Display all students");
        System.out.println("4. Find Average Grade");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    GradeTracker gt = new GradeTracker();

    public String toString(){
        System.out.println("Students:\n");
        return"{Name: "+ getName()+"\nGrade: "+getGrade()+"}";
    }
    public double averageGrade(){
        
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student =new Student();

        System.out.println("Welcome to the Student Grade Tracker!");

        while (true){
            student.options();
            int userChoice= input.nextInt();

            switch (userChoice){
                case 1:
                    System.out.print("Enter Student name: ");
                    input.nextLine();
                    String name= input.nextLine();
                    student.setName(name);
                    System.out.print("Enter Student grade: ");
                    double grade = input.nextDouble();
                    student.setGrade(grade);
                    System.out.println("Adding student...");
                    student.gt.addStudent(new Student(name,grade));
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    System.out.print("Enter name  of student you want to remove: ");
                    input.nextLine();
                    String removeName=input.nextLine();
                    System.out.println("Removing student...");
                    student.gt.removeStudent(removeName);
                    System.out.println("Student successfully removed");
                    break;
                case 3:
                    student.gt.displayDetails();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }


            }

        }

    }

