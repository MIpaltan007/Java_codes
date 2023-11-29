import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int a=sc.nextInt();
       int s=0,r;
       while(a!=0){
          r=a%10;
          s+=r;
          a/=10;
       }
       System.out.println(s);
sc.close();
    }
}
