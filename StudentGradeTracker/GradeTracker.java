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
   public void displayDetails(){
       System.out.println("Students:\n");
       System.out.println("----------------------------");
        if(studentArr.isEmpty()){
            System.out.println("No student record found");
        }
        for(Student student: studentArr){
            System.out.println(student.toString());
        }
   }

   //Average grade method
    public double averageGrade(){
        double sum =0;
        int number=getStudentArr().size();
        for(Student student : studentArr){
            sum+=student.getGrade();
        }
        return averageGrade()/number;
    }

    public static void main (String [] args){

    }
}
