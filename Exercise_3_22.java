import java.util.*;
public class Exercise_3_22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Coordinates");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter Radius");
        int r=sc.nextInt();
        double c=Math.sqrt(a*a + b*b);
        if(c>r){
            System.out.println("Point "+a+".0,"+b+".0 "+"is outside the circle");
        }
        else{
             System.out.println("Point "+a+".0 ,"+b+".0 "+"is inside the circle");
        }
        sc.close();

    }
}
