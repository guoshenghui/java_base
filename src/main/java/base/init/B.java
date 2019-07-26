package base.init;

public class B extends A {
    public B() {
        System.out.println("Class B");
    }

    {
        System.out.println("Block B");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
