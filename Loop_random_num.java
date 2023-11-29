import java.util.*;
public class Loop_random_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int n=(int)(Math.random()*100);
        while(n!=a){
            System.out.println("Enter Your number");
            a=sc.nextInt();
            if(n==a){
                System.out.println("Guessed Correctly");
                break;
            }
            else if(n>a){
                System.out.println("Needs a Higher Guess");
            }
            else if(n<a){
                System.out.println("Needs a Smaller Guess");
            }

        }
        sc.close();
    }
}
