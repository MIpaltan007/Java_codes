import java.util.*;
public class Multiplication_table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,a,j;
        a=sc.nextInt();
        for(i=1;i<=a;i++){
            for(j=1;j<=a;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }

    }
}
