import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,n=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int i;
        for(i=Math.min(a,b);i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                n=i;
            }
        }
        System.out.println("GCD="+n);
        sc.close();
    }
}
