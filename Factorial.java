import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,m=1;
        for(i=1;i<=a;i++){
            m*=i;
        }
        System.out.println(m);
        sc.close();
    }
}
