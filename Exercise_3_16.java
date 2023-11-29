import java.util.*;
public class Exercise_3_16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Width");
        int a=sc.nextInt();
        System.out.println("Enter Height");
        int b=sc.nextInt();
        int c=a/2,d=b/2;
        System.out.println("Generating a Random Coordinate inside Rectangle");
        int w=(int)((Math.random()*a)-c);
        int h=(int)((Math.random()*b)-d);
        System.out.println(w+","+h);
       sc.close();
    }
}
