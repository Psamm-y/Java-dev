import java.util.Arrays;

public class Array {
    static void Name(String firstName){
        System.out.println(firstName+" Ampadu");
    }

    public static void checkAge(int age){
        if (age<18){
            System.out.println("Oops, still young");
        }else if(age>18 && age<30){
            System.out.println("Oh okayy, you're old enough");
        }else{
            System.out.println("Ei seniormost odogwu");
        }

    }
    public static void  main(String args[]){
        int[] ages ={20,18,21,30,24,28,19};

        int lowestAge =ages[0];
        for (int age:ages){
            if (age<lowestAge){
                lowestAge=age;
            }

        }
        System.out.println(lowestAge);
        int[][] myNumbers={{2,6,5,3},{1,12,33}};
        for (int i=0;i<myNumbers.length;i++){
            for (int j=0;j<myNumbers[i].length;j++){
                System.out.println(myNumbers[i][j]);
            }
        }

        for(int[] number:myNumbers){

                System.out.println(Arrays.toString(number));
            }
        System.out.println(myNumbers[0][3]);

        Name("Samuel Amoako");
        Name("Sandra Anima");
        Name("Emmanuel Obeng");
        Name("Blessing Ayim");
        Name("Augustine Asomani");
        Name("Vanessa Owusuaa");
        Name("Jayden Obrempong");

        checkAge(49);

    }

}
