import java.util.*;
public class Square_of_all_n {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter No.of Elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //System.out.println("Enter elements");
        for(i=0;i<n;i++){
            arr[i]=i+1;
        }
        System.out.println("Printing Squares of elements");
        for(i=0;i<n;i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
        sc.close();

    }
}
