package Javadev;

public abstract class Abstract {
    public abstract void classA();
    public void sleep(){
        System.out.println("Zzzzzz");
    };

    class subAbstract extends Abstract{
        public void classA(){
            System.out.println("Hurrayyy!");

        }


        
    }
}
