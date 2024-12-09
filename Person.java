public class Person {
    private String name;
Person (String name){
    System.out.println(name);
}
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static void main(String [] args){
        Person samuel = new Person("Sam");
        System.out.println(samuel.name);




    }

}
