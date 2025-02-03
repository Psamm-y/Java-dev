package Javadev.StudentGradeTracker;

import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Student> studentArr = new ArrayList<>();

    public ArrayList<Student> getStudentArr() {
        return studentArr;
    }
   public void addStudent(Student student){
       studentArr.add(student);
   }

   Student student= new Student();
   public void removeStudent(String name){
       if(name.equalsIgnoreCase(student.getName())){
           studentArr.remove(student);
       }
   }

   public String toString(){
       return "Name: "+ student.getName()+"\nGrade: "+student.getGrade();
   }
    public static void main (String [] args){

    }
}
