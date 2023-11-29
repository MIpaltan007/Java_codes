import java.util.*;
public class Angles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /*  System.out.println("Enter Side A");
        double a=sc.nextDouble();
        System.out.println("Enter Side B");
        double b=sc.nextDouble();
        System.out.println("Enter side C");
        double c=sc.nextDouble();
        double angle_a=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        double angle_b=(Math.acos((a*a+c*c-b*b)/(2*a*c)));
        double angle_c=(Math.acos((a*a+b*b-c*c)/(2*a*b)));
        System.out.println("Angle A="+angle_a);
        System.out.println("Angle B="+angle_b);
        System.out.println("Angle C="+angle_c);
        */
        double x1,y1,x2,y2,x3,y3;
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        x3=sc.nextDouble();
        y3=sc.nextDouble();
        double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double c=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double A=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        double B=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
        double C=Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
        System.out.println("Angle A="+A+" Angle B="+B+" Angle C="+C);
        sc.close();
    }
}
