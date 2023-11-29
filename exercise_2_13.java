import java.util.*;
public class exercise_2_13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Monthly Savings Amount-");
        double a=sc.nextDouble();
        final double M_I_R=0.00417;
        System.out.println("Enter Number of months-");
        int c=sc.nextInt();
        int i;
        double t=a*(1 + M_I_R);
        for(i=1;i<=c-1;i++){
            t=(t+a)*(1 + M_I_R);
        }
       System.out.println("Total Account Value After "+c+" Months = "+t);

    }
}
