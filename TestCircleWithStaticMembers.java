import java.util.*;
public class TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Before Creating Objects");
        System.out.println("The number of Circle objects is "+CircleWithStaticMembers.numberOfObjects);

        CircleWithStaticMembers c1=new CircleWithStaticMembers();
        System.out.println("\n After Creating c1");
        System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberOfObjects+")");
        CircleWithStaticMembers c2=new CircleWithStaticMembers(5);
        c1.radius=9;
        System.out.println("\n After creating c2 and modifying c1");
        System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberOfObjects+")");

    }
}
