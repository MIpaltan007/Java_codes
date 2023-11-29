import java.util.Arrays;
import java.util.*;
public class exercise_3_8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        int i;
        for(i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        for(i=0;i<3;i++){
            System.out.println(arr[i]);
        }

    }
}
