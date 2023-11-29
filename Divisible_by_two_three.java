import java.util.*;
public class Divisible_by_two_three {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0 && a%3==0){
            System.out.println("Divisible by both 2 and 3");
        }
        else if(a%2==0 || a%3==0){
            System.out.println("Divisible by 2 or 3");
        }
        else if(a%2==0 || a%3==0 && a%6!=0){
            System.out.println("Divisible by 2 or 3 but not both");
        }
        sc.close();
    }
}
