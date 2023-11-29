import java.util.*;
public class exercise_2_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Minutes");
        int a=sc.nextInt();
        int years=(a/525600);
        int days=(a%525600)/1440;
        System.out.println("No. of years = "+years);
        System.out.println("No. of Days = "+days);
        sc.close();

    }
}
