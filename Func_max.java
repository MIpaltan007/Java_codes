import java.util.*;
public class Func_max {
    public static int max(int x,int y){
        int result=0;
        if(x>y){
            result=x;
        }
        else{
            result=y;
        }
        return result;
    }
    public static void main(String[] args){
        int i=2;
        int j=5;
        int k=max(i,j);
        System.out.println("maximum = "+k);
    }
    
}
