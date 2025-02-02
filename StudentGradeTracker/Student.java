package Javadev.StudentGradeTracker;

public class Student {
    private String name;
    private double grade;

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
            throw new IllegalArgumentException("Grade shoud be greater than zero");
        }
        this.grade = grade;
    }

    public static void main(String[] args){
        Student student =new Student("Samuel",12);
        System.out.println(student);
    }

}
