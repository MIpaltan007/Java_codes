import java.util.*;
public class Random_numbers {
    public static void main(String[] args){
      Scanner sky=new Scanner(System.in);
      while(true){
        int num=(int)(Math.random()*10 +1);
        if(num==5){
            break;
        }
        if(num%4==0){
            System.out.print("Hello ");
            continue;
        }
        System.out.print(num+" ");
      }
      sky.close();
    }
}
