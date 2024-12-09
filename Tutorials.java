import java.util.Scanner;

public class Tutorials {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7 ");
        int dayNumber=input.nextInt();

        if(dayNumber==1){
            System.out.println("Monday");
        }else if (dayNumber==2){
            System.out.println("Tuesday");
        }else if (dayNumber==3){
            System.out.println("Wednesday");
        }else if (dayNumber==4){
            System.out.println("Thursday");
        }else if (dayNumber==5){
            System.out.println("Friday");
        }else if (dayNumber==6){
            System.out.println("Saturday");
        }else if (dayNumber==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Enter a valid number ");
        }
        System.out.println("Enter the first number ");
        int a= input.nextInt();
        System.out.println("Enter the second number ");
        int b= input.nextInt();
        System.out.println("Enter the third number ");
        int c= input.nextInt();

        int highestNumber=a;
        if (a>b && a>c){
            highestNumber=a;
        }else if(b>a && b>c){
            highestNumber=b;
        }else{
            highestNumber=c;
        }
        System.out.println("The highest number is: "+highestNumber);
    }

}
