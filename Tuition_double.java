import java.util.*;
public class Tuition_double {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int i=0,a;
       a=sc.nextInt();
       int b=a;
       while(a<=2*b){
       a+=a*0.07;
       i++;
        
       }
       System.out.println(i);

    }
}
