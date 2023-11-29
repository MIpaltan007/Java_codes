import java.util.*;
public class Tower_of_Hanoi {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n=input.nextInt();
        System.out.println("The Moves are:");
        moveDisks(n,'A','B','C');
        input.close();
    }
    public static void moveDisks(int n, char fromTower,char ToTower,char AuxTower){
        if(n==1){
            System.out.println("Move Disks " + n + " From "+ fromTower+" to "+ToTower);
        }
        else{
            moveDisks(n-1, fromTower, AuxTower, ToTower);
            System.out.println("Move Disks "+n+" From "+fromTower+" to "+ToTower);
        }
    }
}
