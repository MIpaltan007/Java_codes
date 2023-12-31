import java.util.*;
public class Recursive_Selection_Sort {
    public static void sort(double list[]){
        sort(list,0,list.length -1);
    }
    public static void sort(double list[],int low,int high){
        if(low<high){
            int indexOfMin=low,i;
            double min=list[low];
            for(i=low+1;i<=high;i++){
                if(list[i]<min){
                    min=list[i];
                    indexOfMin=i;
                }
            }
          
            //Swap the smallest in list(low..high) with list(low)
            list[indexOfMin]=list[low];
            list[low]=min;

            sort(list,low+1,high);

        }
    }
    public static void main(String[] args){

    }
}
