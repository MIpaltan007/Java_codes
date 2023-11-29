import java.util.*;

 class Car{
    String model;
    String color;
    int price;
    boolean isLocked=false;


    Car(){
        System.out.println("Inside Default Constructor");
        model="Hatchback";
        color="Black";
        price=10000;
    }
    // Constructor
    Car(String modelname,String colourname,int priceValue){
       //System.out.println("Inside the constructor");
       System.out.println("Inside Parameterised Constructor");
       model=modelname;
       color=colourname;
       setprice(priceValue);
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
public class Constructor {
    public static void main(String[] args){
       Car c1=new Car("Hatchback","Black",2000);
       Car c2=new Car();
       System.out.println(c1.model);
       System.out.println(c1.color);
       System.out.println(c1.price);
       
       System.out.println(c2.model);
       System.out.println(c2.color);
       System.out.println(c2.price);
      /*  System.out.println(c1.model);
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
       */
    }
}
