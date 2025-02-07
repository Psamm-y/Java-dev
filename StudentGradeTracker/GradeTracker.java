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

   public void removeStudent(String name){
       for (int i =0;i <studentArr.size();i++){
           if(studentArr.get(i).getName().equalsIgnoreCase(name)){
               studentArr.remove(i);
               return;
           }
       }
       System.out.println("OOps");
   }


    public static void main (String [] args){

    }
}
