import java.util.*;
public class QoutientWithException {
    public static int qoutient(int number1,int number2){
        if(number2==0){
            throw new ArithmeticException("Divisor Cannot be zero");
        }
        return number1/number2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 Integers ");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        try{
            int result=qoutient(number1, number2);
            System.out.println(number1+" / "+number2+" is "+result);
        }
        catch (ArithmeticException ex){
            System.out.println("Exception: an integer "+"Cannot be divided by zero");
        }
        System.out.println("Execution Continues ...");
        sc.close();
    }
}
