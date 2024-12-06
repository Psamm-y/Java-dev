import java.util.Scanner;

public class reverseString {

    public static void main(String [] args){
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter a word to be reversed: ");

    String word=scan.nextLine();
    String output= reverseWord(word);

        System.out.println(output);
        scan.close();




      String name = "Samuel";

    }

    static String reverseWord(String word){
       word=word.toLowerCase();
        int length= word.length();
        StringBuilder reversed = new StringBuilder();



        for (int i=length-1;i>=0;i--){
          reversed.append(word.charAt(i));
        }
        String reversedWord=reversed.toString();

        return reversedWord.toUpperCase().charAt(0)+reversedWord.substring(1);

    }
}
