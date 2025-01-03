package Javadev;
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}


public class NestedClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        int var1= myOuter.x;
        int var2= myInner.y;
        System.out.println(var1/var2);
    }
}