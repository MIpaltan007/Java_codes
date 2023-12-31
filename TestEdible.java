import java.util.*;
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(),new Chicken(),new Apple()};
        int i;
        for(i=0;i<objects.length;i++){
            if(objects[i] instanceof Edible)
            System.out.println(((Edible)objects[i]).howToEat());

            if(objects[i] instanceof Animal){
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
    
}
abstract class Animal {
    public abstract String sound();

}
class Chicken extends Animal implements Edible {
    @Override
    public String howToEat(){
        return "Chicken: Fry it";
    }

    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound(){
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {

}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple: Make Apple Cider";
    }
}
class Orange extends Fruit {
    @Override
    public String howToEat(){
        return "Orange: Make Orange Juice";
    }
}