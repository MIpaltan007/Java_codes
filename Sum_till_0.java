import java.util.*;
public class Sum_till_0 {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int a,s=0;
      do{
        a=sc.nextInt();
        s+=a;
      }while(a!=0);
      System.out.println("Sum="+s);
      sc.close();
    }
}
