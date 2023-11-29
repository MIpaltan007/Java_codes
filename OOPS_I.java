import java.util.*;
 class Car{
    String model="Hatchback";
    String color="Black";
    int price=100000;
    boolean isLocked=false;

    // Constructor
    Car(){
       System.out.println("Inside the constructor");
    }
    void drive(){
        System.out.println("Zoom zoom zoom");
    }
    void lock(){
        isLocked=true;
        System.out.println("Car is locked");
    }
    void unlock(){
        isLocked=false;
        System.out.println("Car is unlocked");
    }

    //gettter
    int GetPrice(){
        return price;
    }

    //setter
    void setprice(int pricevalue){
        if(pricevalue<0){
            pricevalue=0;
        }
        price=pricevalue;
    }
}
public class OOPS_I {
    public static void main(String[] args){
       Car c1=new Car();
       Car c2=new Car();
       System.out.println(c1.model);
       System.out.println(c1.color);
       System.out.println(c1.price);
       c2.color="Gray";
       System.out.println(c2.color);
       c1.drive();
       c2.drive();
       c1.lock();
       c2.unlock();
       System.out.println(c1.isLocked);
       System.out.println(c2.isLocked);
       c2.setprice(5000);
       System.out.println(c2.GetPrice());
       
    }
}
