import java.util.*;

public class Encapsulation {
    private String name;
    private String energy;

    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name=newName;
        }

    public static void main(String[] args){
        Encapsulation objectName=new Encapsulation();
        objectName.setName("Samuel");
        System.out.println(objectName.name);
    }
}


