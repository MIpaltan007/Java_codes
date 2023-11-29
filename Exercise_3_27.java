import java.util.*;
public class Exercise_3_27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Coordinates You Want TO Check");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a<=200 && b<=100){
            System.out.println("The Point is in Triangle");
        }
        else{
            System.out.println("The Point is outside the triangle");
        }
        sc.close();
                }
}
