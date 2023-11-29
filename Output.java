import java.util.*;
public class Output {
    public static int m(int x,int y){
            x+=2;
            System.out.print(x+" ");
            y-=2;
            return x*y;
        }
    public static void main(String[] args){
        int x=5,y=7;
        System.out.print(m(x,y)+" "+x+" "+m(y,x));
        
    }
}
