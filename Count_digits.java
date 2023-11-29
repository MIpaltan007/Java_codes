import java.util.*;
public class Count_digits {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        int a=sky.nextInt();
        int c=0;
        while(a!=0){
        a/=10;
        c++;
        }
        System.out.println("No. of digits = "+c);
        sky.close();
    }
}
