import java.util.*;
public class Random_Lottery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int guess=(int)(Math.random()*90 + 10);
        System.out.println("Enter Your Guess");
        int v=sc.nextInt();
        int g1=guess/10,g2=guess%10;
        int v1=v/10,v2=v%10;
        if(v==guess){
            System.out.println("Congratulations!!! You have won 10,000");
        }
        else if(g1==v2 && g2==v1){
            System.out.println("Congratulations!!! You have won 3000");
        }
        else if(g1==v2||g1==v1||g2==v1||g2==v2){
            System.out.println("Congratulations!!! You have won 1000");
        }
        else{
            System.out.println("Better Luck Next Time");
        }
        System.out.println("Lottery num = "+guess);
        sc.close();
    }
}
