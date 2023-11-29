import java.util.*;
public class Func_first_50_primes {
    public static boolean isPrime(int n){
        int i;
        if(n<=1){
            return false;
        }
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        final int N_O_P=50;
        final int P_P_L=10;
        int count=0,num=2;
        while(count<N_O_P){
            if(isPrime(num)){
                count++;
                System.out.printf("%-4d",num);
            }
            if(count%P_P_L==0){
                System.out.println();
            }
            num++;
        }
    }
}
