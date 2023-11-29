import java.util.*;
public class Above_Average {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       int i,s=0,c=0;
       double avg=0;
       for(i=0;i<10;i++){
        arr[i]=sc.nextInt();
        s+=arr[i];
       }
       avg=(double)(s/10.0);
       for(i=0;i<10;i++){
        if(arr[i]>avg){
            c++;
        }
       }
       System.out.println("Average = "+avg);
       System.out.println("No.of elements above average = "+c);
sc.close();
    }
}
