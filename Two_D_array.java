import java.util.*;

public class Two_D_array {
    public static void main(String[] args){
        /*int [][]a={
            {6,2,7},{0,-3,1},{7,2},{0,5,3,2}
        };
        System.out.println(a[2][2]);
        */
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
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }

    }
}
