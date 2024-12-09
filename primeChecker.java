import java.util.Scanner;

public class primeChecker{

    String [] arr= {"Ampadu", "Joseph"};
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check if it's prime: ");

        int number =scan.nextInt();
        if (isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number +  " is not prime");
        }

    }

    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        if (num==2){
            return true;
        }

        for(int i=3;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
}