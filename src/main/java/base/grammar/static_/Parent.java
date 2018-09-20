package base.grammar.static_;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parent {
    private int p_a;
    private static int p_b;
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

    public Parent(int a,int b){
        p_a=a;
        p_b=b;
        System.out.println("父类构造器,p_b:"+p_b+",p_a:"+p_a);
    }

}
