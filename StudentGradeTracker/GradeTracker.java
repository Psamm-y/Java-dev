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
           if(!(studentArr.get(i).getName().equalsIgnoreCase(name))){
               System.out.println("Oops, record not found");
           }else{
               System.out.println("Removing student...");
               System.out.println("---------------------------------");
               studentArr.remove(i);
               System.out.println("Student successfully removed");
               return;
           }
       }
       System.out.println("No student records available");

   }
   public void displayDetails(){
       System.out.println("Students:");
       System.out.println("---------------------------------");
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
        int number=studentArr.size();
        for(Student student : studentArr){
            sum+=student.getGrade();
        }
        return sum/number;
    }

    public static void main (String [] args){

    }
}
