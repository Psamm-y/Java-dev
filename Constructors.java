public class Constructors {
int x;
    public Constructors(int y){
        x=y;
    }

    public static void main(String[]args){
        Constructors var=new Constructors(32);
        System.out.println(var.x);

        Constructors car=new Constructors(1969,"Mustang");
        System.out.println(car.modelYear+ " " + car.modelName);
    }
    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
}
    }

