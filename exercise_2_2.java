import java.util.*;
public class exercise_2_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        double r=sc.nextDouble();
        System.out.println("Enter Length");
        double l=sc.nextDouble();
     final  double PI=Math.PI;
      double area=r*r*PI;
      double vol=area*l;
      System.out.println("Area of Cylinder = "+area);
      System.out.println("Volume of Cylinder = "+vol);
      sc.close();
    }
}
