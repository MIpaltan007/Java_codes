import java.util.*;
public class Exercise_3_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the edges of triangle");
        System.out.println("Edge -1");
        int a=sc.nextInt();
        System.out.println("Edge -2");
        int b=sc.nextInt();
        System.out.println("Edge -3");
        int c=sc.nextInt();
        int d=a+b+c;
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Input");
            System.out.println("Perimeter = "+d);
        }
        else{
            System.out.println("Invalid Edges");
        }
        
sc.close();
    }
}
