import java.util.*;
public class exercise_1_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total distance travelled in kms");
        double a=sc.nextDouble();
        double miles=(double)(a/1.6);
        System.out.println("Enter hours");
        int b=sc.nextInt();
        System.out.println("Enter Minutes");
        int c=sc.nextInt();
        System.out.println("Enter Seconds");
        int d=sc.nextInt();
        double t=(double)(b+((c+(d/60.0))/60.0));
        double speed=(double)(miles/t);
        System.out.println("Speed = "+speed);
        sc.close();


    }
}
