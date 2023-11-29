import java.util.*;
public class Sum_of_numbers {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        int n=sky.nextInt();
        int i,s=0;
        for(i=1;i<=n;i++){
            int curr=sky.nextInt();
            s+=curr;
        }
        System.out.println("Sum = "+s);
        sky.close();
    }
}
