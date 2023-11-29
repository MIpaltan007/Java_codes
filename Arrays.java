import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        int i;
        int arr[]=new int[5];
        System.out.println("Enter Array Elements");
        for(i=0;i<arr.length;i++){
            arr[i]=sky.nextInt();
        }
        System.out.println("Printing Array Elements");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sky.close();
    }
}
