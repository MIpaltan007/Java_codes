import java.util.*;
import java.util.Arrays;
public class Insertion_sort {
    public static void main(String[] args){
        int mylist[]={2,9,5,4,8,1,6};
        Arrays.sort(mylist);


    }
    public static void insertionsort(double[] list){
        for(int i=1;i<list.length;i++){
            double currentelement=list[i];
            int k;
            for(k=i-1;k>=0 && list[k]>currentelement;k--){
                list[k+1]=list[k];
            }
            list[k+1]=currentelement;
        }
    }
}
