import java.util.*;
public class Simple_interest {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int a=sky.nextInt();
        System.out.println("Enter Rate");
        int b=sky.nextInt();
        System.out.println("Enter Time");
        int c=sky.nextInt();
        System.out.println("Simple Interest = "+(a*b*c)/100.0);
        sky.close();
    }
}
