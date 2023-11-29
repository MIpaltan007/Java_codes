import java.util.*;
public class Largest_number {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        int n=sky.nextInt();
        int i,maxvalue=Integer.MIN_VALUE;
        for(i=1;i<=n;i++){
            int c=sky.nextInt();
            maxvalue=Math.max(maxvalue,c);
        }
        System.out.println(maxvalue);
        sky.close();
    }
}
