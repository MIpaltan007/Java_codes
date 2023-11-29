import java.util.*;

public class Linear_Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Elements");
        int i;
        int n=sc.nextInt();
        System.out.println("Entering Array Elements");
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to search");
        int key=sc.nextInt();
        int flag=0,r=0;
        for(i=0;i<n;i++){
            if(arr[i]==key){
              flag=1;
              r=i+1;
              break;
            }
        }
        if(flag==0){
          System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found at "+r+"th position");
        }
      sc.close();
    }
}
