import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        System.out.println("Hello");

/*String word="Hm";
       for(int i =1;i<20;i++){
           System.out.println(word);
           word+='m';
        }
        double random= (int) (Math.random() *10);
        int num=12;
        int num2=5;
        int div=num/num2;
        System.out.println(div);
        System.out.println(random);

        Scanner input= new Scanner(System.in);
        System.out.println("Put in a value for ang");
        int ang =input.nextInt();
        switch (ang){
            case 110:
                System.out.println("This is the shi mernnn");
                break;
            case 109:
                System.out.println("Naa you ain't the shi bruva");
                break;
            case 12:
                System.out.println("Oh okayy");
                break;
            default:
                System.out.println("I'm gone");
                break;

            }
        System.out.println("put in the countdown value guy!");
            int countDown=input.nextInt();

            do{
                System.out.println(countDown);
                countDown--;
            }while (countDown>0);
         int diceNumber=1;
        while(diceNumber<=6){
           if(diceNumber==6){
               System.out.println("Yatzy!");
               }else{
               System.out.println("Oops, no Yatzy!");
           }
           diceNumber+=1;
        }*/
        //Nested loop
        for (int i=1;i<=2;i++){
            System.out.println("Outer: " + i);
            for (int j=1;j<=3;j++){
                System.out.println("Inner: "+j);


            }
            int [] myArray=new int[3];
            myArray[0]=1;
            myArray[1]=2;
            myArray[2]=3;
            System.out.println(Arrays.toString(myArray));

            for(int a:myArray){
                System.out.println(a);
            }
         for (int a=0;a<=10;a++){
             if(a%2!=0 || a==0){
                 continue;
             }
             System.out.println(a);
         }
            System.out.println("Here");
         for(int number:myArray){
             System.out.println(number);
         }
            float avg, sum = 0;
        }
        }


    }



