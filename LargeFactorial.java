import java.math.BigInteger;
import java.util.*;
public class LargeFactorial {
    public static void main(String[] args){
        System.out.println("50! is \n" + factorial(50));
    }
    public static BigInteger factorial(long n){
        BigInteger result=BigInteger.ONE;
        int i;
        for(i=1;i<=n;i++){
            result=result.multiply(new BigInteger(i+""));
        }
        return result;
    }
}
