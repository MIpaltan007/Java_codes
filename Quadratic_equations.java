import java.util.*;
public class Quadratic_equations {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       double a=sc.nextDouble();
       double b=sc.nextDouble();
       double c=sc.nextDouble();
       double d=b*b - 4*a*c;
       double r1,r2;
       if(d>0){
         r1=(-b + Math.sqrt(d))/(2*a);
         r2=(-b - Math.sqrt(d))/(2*a);
         System.out.println("Root_1 = "+r1+"Root_2 = "+r2);
       }
       else if(d==0){
        r1=r2=(-b)/2*a;
       }
       else{
        r1=-b/(2*a);
        r2=Math.sqrt(-d)/(2*a);
        System.out.println(r1+"+"+r2+"i");
        System.out.println(r1+"-"+r2+"i");
       }
    }
}
