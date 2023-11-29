import java.util.*;
public class Displacement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial Velocity");
        double v_0=sc.nextDouble();
        System.out.println("Enter Acceleration");
        double a=sc.nextDouble();
        System.out.println("Enter Time");
        double t=sc.nextDouble();
        double d=(v_0*t)+(0.5)*(a*t*t);
        System.out.println("Displacemet = "+d);
        sc.close();
    }
}
