import java.util.*;
public class Zodiac_sign {
    public static void main(String[] args){
       Scanner sky=new Scanner(System.in);
       int a=sky.nextInt();
       int b=a%12;
       switch(a%12){
        case 0:
        System.out.println("Monkey");
        break;
        case 1:
        System.out.println("Rooster");
        break;
        case 2:
        System.out.println("Dog");
        break;
        case 3:
        System.out.println("Pig");
        break;
        case 4:
        System.out.println("Rat");
        break;
        case 5:
        System.out.println("Ox");
        break;
        case 6:
        System.out.println("Tiger");
        break;
        case 7:
        System.out.println("Rabbit");
        break;
        case 8:
        System.out.println("Dragon");
        break;
        case 9:
        System.out.println("Snake");
        break;
        case 10:
        System.out.println("Horse");
        break;
        default:
        System.out.println("Sheep");
        break;
       }
    }
}
