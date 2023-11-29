import java.util.*;
public class Cards {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[52];
        int i;
        for(i=0;i<52;i++){
            arr[i]=i;
        }
        //Random Shuffling
        for(i=0;i<arr.length;i++){
            //generate an index randomly
            int index=(int)(Math.random()*arr.length);

            //Swap arr[i] with arr[index]
            int t=arr[i];
            arr[i]=arr[index];
            arr[index]=t;
        }
        //System.out.println("");
        sc.close();
    }
}
