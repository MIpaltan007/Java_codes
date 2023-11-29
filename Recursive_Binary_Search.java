import java.util.*;
public class Recursive_Binary_Search {
   
    public static void Bin_Ser(int a[],int key,int s,int l){

         int mid=s+(l-s)/2,g=0;
         while(s<l){
            if(key>a[mid]){
              s=mid+1;
            }
            else if(key<a[mid]){
                l=mid-1;
            }
            else if(key==a[mid]){
               g=1;
            }
            mid=s+(l-s)/2;
         }
         if(g!=0){
            System.out.println("Element Found, Successful Binary Search");
         }
         else{
           System.out.println("Element Not Found");
         }
    }
}
