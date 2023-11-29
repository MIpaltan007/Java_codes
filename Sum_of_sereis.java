import java.util.*;
public class Sum_of_sereis {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      double i,s=0;
      for(i=0.01;i<=1.0;i+=0.01){
        s+=i;
      }
      System.out.println("Sum="+s);
      sc.close();
    }
}
