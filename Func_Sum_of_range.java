import java.util.*;
public class Func_Sum_of_range {
    public static int sum(int x,int y){
        int i,s=0;
        for(i=x;i<=y;i++){
            s+=i;
        }
        return s;
    }
    public static void main(String[] args){
        int total1=sum(1,10);
        System.out.println(total1);
    }
}
