package base.grammar.static_;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sub extends  Parent{
    private int s_a;
    private static int s_b;
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
    public Sub(int a,int b){
        s_a=a;
        s_b=b;
        System.out.println("子类构造器,s_b:"+s_b+",s_a:"+s_a);
    }

    public static void main(String[] args){
      //  Sub sub=new Sub(1,2);
     //   Sub sub1=new Sub();
      //  Sub.init();
        Parent parent=new Sub(1,2);
        System.out.println(parent.getP_a());
    }
}
