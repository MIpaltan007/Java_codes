import java.util.*;
public class exercise_1_12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in miles");
        int a=sc.nextInt();
        System.out.println("Enter Total hrs");
        int b=sc.nextInt();
        System.out.println("Enter Total min");
        int c=sc.nextInt();
        System.out.println("Enter Total seconds");
        int d=sc.nextInt();
        double dist=(double)a*1.6;
        double time=(double)(b+((c+(d/60.0))/60.0));
        double sp=(double)(dist/time);
        System.out.println("Speed = "+sp);

    }
}
