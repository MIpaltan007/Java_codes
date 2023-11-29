import java.util.*;
public class exercise_2_6 {
    public static void main(String[] args){
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter a Number in between 0-1000");
       int a=sc.nextInt();
       int s=0,r=0;
       while(a!=0){
         r=a%10;
         s+=r;
         a/=10;
       }
       System.out.println("Sum of digis = "+s);
    }
}
