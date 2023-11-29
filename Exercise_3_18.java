import java.util.*;
public class Exercise_3_18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight to be dispatched");
        double a=sc.nextDouble();
        double costperunit;
        if(a>50){
           System.out.println("Package Cannot be Shipped");
        }
        else{
          if(a>0 && a<=1){
            costperunit=3.5;
          }
          else if(a<=3){
            costperunit=5.5;
          }
          else if(a<=10){
            costperunit=8.5;
          }
          else{
            costperunit=10.5;
          }
          System.out.println("Total Cost = "+costperunit*a);
        }
        sc.close();
    }
}
