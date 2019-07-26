package base.init;

public class A {
    public A(){
        System.out.println("Class A");
    }

    {
        System.out.println("Block A");
    }

    static {
        System.out.println("static A");
    }

}
