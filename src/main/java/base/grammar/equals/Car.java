package base.grammar.equals;

import java.util.Objects;

public class Car {
    private  int batch;
    public Car(int batch){
        this.batch=batch;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            Car car=(Car)obj;
            return this.batch==car.batch;
        }
        return false;
    }

    public static void main(String[] args){
        Car car1=new Car(1);
        Car car2=new Car(1);
        System.out.println(car1==car2);
        System.out.println(car1.equals(car2));
    }
}
