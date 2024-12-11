package Javadev;

public class Car {
    private String engine;
    private String distanceTravelled;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(String distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public String getYearModel() {
        return yearModel;
    }

    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    private String yearModel;
    private String speed;

    public static void main(String[] args){
        Car myNewCar=new Car();
        myNewCar.setSpeed(String.valueOf(233));
        System.out.println(myNewCar.speed);




    }
}
