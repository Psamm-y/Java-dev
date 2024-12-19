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

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int yearModel;
    private int speed;

    public static void main(String[] args){
        Car myNewCar=new Car();
        myNewCar.setSpeed(233);
        System.out.println(myNewCar.speed);

        myNewCar.setDistanceTravelled(String.valueOf(24));
        System.out.println(myNewCar.distanceTravelled);

        myNewCar.setYearModel(2023);
        String linkOne= "https://teams.microsoft.com/l/meetup-join/19:acopU7n7Jc3ZOJ-Ysg1wLfi6JIJL_bjN5_biqULh7N01@thread.tacv2/1733728838924?context=%7B%22Tid%22:%22941bbf5f-f2c0-4875-a24c-6907865d251a%22,%22Oid%22:%22ce2cd357-7546-4273-a492-7220123b12a7%22%7D";
        String linkTwo= "https://teams.microsoft.com/l/meetup-join/19:acopU7n7Jc3ZOJ-Ysg1wLfi6JIJL_bjN5_biqULh7N01@thread.tacv2/1733728838924?context=%7B%22Tid%22:%22941bbf5f-f2c0-4875-a24c-6907865d251a%22,%22Oid%22:%22ce2cd357-7546-4273-a492-7220123b12a7%22%7D";

        if (linkOne==linkTwo){
            System.out.println("True");
        }else {
            System.out.println("Naa");
        }
    }
}
