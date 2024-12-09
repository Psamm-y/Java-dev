import org.w3c.dom.ls.LSInput;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*        int x=5,y=6,z=13;
                System.out.println(x+y+z);

                int a,b,c;
                a=b=c=13;
                System.out.println(a+b+c);
                float filter = (float) 2.33;

                // Create integer variables
                int length = 4;
                int width = 6;
                int area;

        // Calculate the area of a rectangle
                area = length * width;

        // Print variables
                System.out.println("Length is: " + length);
                System.out.println("Width is: " + width);
                System.out.println("Area of the rectangle is: " + area);

                float num1=8.639f;
                System.out.println(num1);

                double  num2=3.444E2d;
                System.out.println(num2);

                float power=34E2f;
                System.out.println(power);*/

               /* //maximum score in the game
                int maxScore=1000;

                //user's score at the moment
                int userScore=598;

                //Accurate percentage of score
                float percentFloat=(float) userScore/maxScore * 100.0f;
                System.out.println("Health:"+percentFloat+'%');
        */


                /*int x=3;
                System.out.println(++x);

                int y=2;
                System.out.println(--y+ ++y + y++);
                System.out.println(y^=4);

                Scanner input = new Scanner(System.in);
                System.out.print("Please enter a number: ");
                int number = input.nextInt();*/


        //Algorithm
        // 1.Input a number
        //2. Check if number is divisible by 2 without a remainder
        //3. If yes, print out "Number is even"
        //4.If no, (skip step 3) and print "That is an odd number"

               /* Scanner number = new Scanner(System.in);
                System.out.println("Enter a random number: ");
                int num = number.nextInt();

                if (num % 2==0) {
                    System.out.println("Number is even");
                }
                else {
                    System.out.println("That is an odd number");
                }
                Date date=new Date();*/

        //Data types - Primitive and Reference
                /*long randomNumber=2232121132L;
                float rand2 =1233.323F;
                System.out.println(randomNumber+rand2);
                String name="Samuel";
                System.out.println(name);

                System.out.println(rand2);

                int x=12;

                x=21;
                int b=x;
                System.out.println(b);*/


        //String
       /* String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.contains("Amigs"));

        String passwordOne = "Bilson.45L";
        String repeatPassword = "Bilson.45L";
        boolean passwordMatch = passwordOne.equals(repeatPassword);
        if (passwordMatch) {
            System.out.println("Good to go!");
        } else {
            System.out.println("Oops, Password Mismatch");
        }
    }

    java.sql.Date dateShi = new java.sql.Date(11 - 9 - 2001);*/

        //The Math class
       // System.out.println(Math.toRadians(90));

        //Ternary Operator
        int age = 21;
        String text = age >= 18 ? "Oh yes! I'm that old" : "Naa I'm still a child";
        System.out.println(text);


        String name="Samuel";
        int yearsOld= 3;

        if (name.contains("Sams") || yearsOld==32){
            System.out.println("So true!");
        }
        else {
            System.out.println("Oh naaa");
        }

        String printText= yearsOld>=19?
                "Biggups bruh":"Imma see you in the next life blud";
        System.out.println(printText);


        String gender="fEMAle";
 /*       switch (gender.toUpperCase()){
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "Prefer not to say":
                System.out.println("I'm cool");
                break;
            default:
                System.out.println("Unknown Gender");
        }

*/

        switch (gender.toUpperCase()){
            case "FEMALE":
                System.out.println("That's a girl");
                break;
            case "MALE":
                System.out.println("That's my boyyy \n");
        }
    //Arrays
        int [] numbers = {2,3,4,6,7,9};
        System.out.println(Arrays.toString(numbers));

        int [] numbersTwo = new int[3];
        System.out.println(Arrays.toString(numbersTwo));

        System.out.println(numbersTwo.length);

        String [] names={"Cassandra", "Keren", "Jemimah"};
        names[2]="Opana";

        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }

        //Enhanced For Loop
        for (String n : names) {
            System.out.println(n);
        }

        int [] arrayOne= new int[3];
        arrayOne[0]=32;
        arrayOne[2]=12;

        System.out.println(Arrays.toString(arrayOne));
        for (int i=0;i<arrayOne.length-1;i++){
            System.out.println("This is the value at index "+ i + ": " + arrayOne[i]);
        }

        for (int i : arrayOne) {
            System.out.println(i);
        }

        String [] namesOfGirls= {"Issabella", "Jean", "Keren", "Janelle"};
        for(int i=0;i<namesOfGirls.length-1;i++){
            if(namesOfGirls[i].contains("K")) {
                System.out.println("I got the name, thanks!");
                break;
            }
            System.out.println(namesOfGirls[i]);


        }
        int distance=0;
        String message =distance==21?"That's your actual distance":"You crossed the line";
        System.out.println(message);

        switch (distance) {
            case 21:
                System.out.println("Yes!");
                break;
            case 30:
                System.out.println("nope!");
                break;
            default:
                System.out.println("Thanks!");
                break;
        }

        String appreciation= "Thank You!";
        int count=1;
        while(count <=100){
            System.out.println(count + ". "+ appreciation);
            count++;
        }

        for(int i=1;i<=100;i++) {
            System.out.println(i + ". " + appreciation);
        }

     int amount=3000;
        do{
            System.out.println("I got some cash bruh");
            amount+=1000;
        }while (amount<=6000);

        //Scanner class
        Scanner scanner= new Scanner(System.in);
        System.out.println("What's your name?");
        String userName= scanner.nextLine();
        System.out.println("Hello "+ userName);

        System.out.println("How old are you?");
        int userAge= scanner.nextInt();
        System.out.println("You are "+ userAge + " years old");


        Scanner info= new Scanner(System.in);
        System.out.println("What's your parent's name?");
        String parentName=info.nextLine();
        System.out.println("Okay Mummy " + parentName);

        Scanner peopleAge=new Scanner(System.in);
        System.out.println("Enter any shit bruh");
        int aged= peopleAge.nextInt();
        Sum();
        };
    public static void Sum(){
        Scanner intake= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= intake.nextInt();

        System.out.println("Enter another number ");
        int num2= intake.nextInt();
        int sum= num1+num2;
        System.out.println("The sum is: " +sum);

    }

}



