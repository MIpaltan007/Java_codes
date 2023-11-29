import java.math.BigInteger;
import java.util.*;

public class BigInt_Factorial {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         BigInteger a=new BigInteger("1");
         for(int i=1;i<=x;i++){
            BigInteger temp=new BigInteger(i+" ");
            a=a.multiply(temp);
         }
         sc.close();
         System.out.println(a);
    } 
}
