import java.util.*;
public class Even_Odd {
    public static void main(String[] args){
     Scanner sky = new Scanner(System.in);
    int a=sky.nextInt();
    if(a%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    sky.close();
    }
}
