import java.util.*;
public class Max_Min {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE,i;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("Maximum = "+maxi);
        System.out.println("Minimum = "+mini);
sc.close();
    }
}
