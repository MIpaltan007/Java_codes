import java.util.*;
public class exercise_1_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i;
        System.out.println("  a   a^2  a^3  ");
        for(i=1;i<=a;i++){
            System.out.println("  "+i+"   "+i*i+"   "+i*i*i);
        }
        sc.close();
    }
}
