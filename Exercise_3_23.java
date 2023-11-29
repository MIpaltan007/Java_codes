import java.util.*;
public class Exercise_3_23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Width and Height of Rectangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=a/2.0,d=-a/2.0,e=b/2.0,f=-b/2.0;
        System.out.println("Enter Your Choice Coordinates");
        int g=sc.nextInt();
        int h=sc.nextInt();
        if(g>c||g<d||h>e||h<f){
            System.out.println("Point ("+g+","+h+") is outside the rectangle");
        }
        else{
            System.out.println("Point ("+g+","+h+") is inside the rectangle");
        }
        sc.close();
    }
}
