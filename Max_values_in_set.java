import java.util.*;
public class Max_values_in_set {
   public static int maxi(int a,int b){
      if(a>b){
        return a;
      }
      return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n],i,r=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            r=maxi(r,arr[i]);

        }
        System.out.println("Maximum element= "+r);
        sc.close();
    }
}
