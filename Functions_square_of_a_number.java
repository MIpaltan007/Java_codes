import java.util.*;
public class Functions_square_of_a_number {
    static void Squaress(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Squaress(a);
        sc.close();
    }
}
