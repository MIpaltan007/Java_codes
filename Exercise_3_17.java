import java.util.*;
public class Exercise_3_17 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int r=(int)(Math.random()*3);
         System.out.println("******** WELCOME TO THE GAME*********");
         System.out.println("   CHOOSE FROM THE FOLLOWING OPTION  ");
         System.out.println("   0 - SCISSOR");
         System.out.println("   1 - ROCK   ");
         System.out.println("   2 - PAPER  ");
         int a=sc.nextInt();
         if(r==0){
            System.out.print(" COMPUTER CHOSE SCISSOR ");
         }
         else if(r==1){
            System.out.print(" COMPUTER CHOSE ROCK ");
         }
         else if(r==1){
            System.out.print(" COMPUTER CHOSE PAPER ");
         }

         
         if(a==0){
            System.out.print(" YOU CHOSE SCISSOR ");
         }
         else if(a==1){
            System.out.print(" YOU CHOSE ROCK ");
         }
         else if(a==2){
            System.out.print(" YOU CHOSE PAPER ");
         }
         if(r==0){
            if(a==0){
                System.out.print(" TOO, IT'S A DRAW ");
            }
            else if(a==1){
                System.out.print(" YOU WON!!! ");
            }
            else if(a==2){
                System.out.print(" COMPUTER WON ");
            }
         }
         else if(r==1){
            if(a==0){
                System.out.print(" COMPUTER WON ");
            }
            else if(a==1){
                System.out.print(" TOO, IT'S A DRAW ");
            }
            else if(a==2){
                System.out.print(" YOU WON!!! ");
            }
         }
         else if(r==2){
             if(a==0){
                System.out.print(" COMPUTER WON ");
            }
            else if(a==2){
                System.out.print(" TOO, IT'S A DRAW ");
            }
            else if(a==1){
                System.out.print(" YOU WON!!! ");
            }
         }
         sc.close();
    }
}
