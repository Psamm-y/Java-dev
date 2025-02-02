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

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student =new Student();

        try{
            student.setGrade(-1);
        }catch (IllegalArgumentException m){
            System.out.println("Error: "+ m.getMessage());
        }
       // System.out.println(student);
    }

}
