package base.grammar.static_;

public class Parent {
    private int p_a=1;
    private static int p_b=2;
    static{
        System.out.println("父类静态代码块,p_b:"+p_b);
}

    {
        System.out.println("父类非静态代码块,p_b:"+p_b);
    }

    public static void init(){
        System.out.println("父类静态方法,p_b:"+p_b);
    }

    public Parent(){
        System.out.println("父类构造器,p_b:"+p_b+",p_a:"+p_a);
    }

}
