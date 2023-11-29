import java.util.*;

public class Sum_of_2_matrices {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int [][] arr=new int[a][b];
        int i,j;
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int [][] arr1=new int[a][b];
         for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int [][] arr2=new int[a][b];
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
