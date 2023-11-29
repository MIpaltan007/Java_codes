import java.util.*;
public class Exercise_3_29 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1,y1,x2,y2,r1,r2;
        System.out.println("Enter 1st circle center coordinates and radius");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        r1=sc.nextDouble();
        System.out.println("Enter 2nd Circle Center coordinates and Radius");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        r2=sc.nextDouble();
        double d=Math.sqrt((x1-y1)*(x1-y1) + (x2-y2)*(x2-y2));
        if(d<=Math.abs(r1-r2)){
            System.out.println("Circe 2 is inside Circle 1");
        }
        else if(d<=(r1+r2)){
            System.out.println("Circle 2 Overlaps Circle 1");
        }
        else{
            System.out.println("Circle 2 Doesn't Overlaps Circle 1");
        }
        sc.close();
    }
}
