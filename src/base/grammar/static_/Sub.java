package base.grammar.static_;

public class Sub extends  Parent{
    private int s_a=3;
    private static int s_b=4;
    static{
        System.out.println("子类静态代码块,s_b:"+s_b);
    }

    {
        System.out.println("子类非静态代码块,s_b:"+s_b);
    }

    public static void init(){
        System.out.println("子类静态方法,s_b:"+s_b);
    }

    public Sub(){
        System.out.println("子类构造器,s_b:"+s_b+",s_a:"+s_a);
    }

    public static void main(String[] args){
        Sub sub=new Sub();
        Sub sub1=new Sub();
      //  Sub.init();


    }
}
