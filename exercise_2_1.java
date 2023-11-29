import java.util.*;
public class exercise_2_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celcius");
        double c=sc.nextDouble();
        double f=((9.0/5)*c) + 32;
        System.out.println("Temperature in Farheinheit = "+f);

    }
}
