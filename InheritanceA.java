package Javadev;

public class InheritanceA {
    protected String brandName;

    public void horn() {
        System.out.println("Tuut, tuut");
    }

}
    class Cars extends InheritanceA {




        public static void main(String [] args){
            Car newCar = new Car();
            String result =newCar.getEngine()+ " 12";
            System.out.println(result);
            InheritanceA inh = new InheritanceA();
            Cars myCar = new Cars();
            myCar.horn();
            inh.horn();
        }



    }

