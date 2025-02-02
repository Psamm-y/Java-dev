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

   public void removeStudent(Student student){
       studentArr.remove(student);
   }
    public static void main (String [] args){
       GradeTracker gt = new GradeTracker();
        System.out.println(gt.studentArr);
    }
}
