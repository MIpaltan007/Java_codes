import java.util.*;
public class Formatting_Console_Output {
    public static void main(String[] args){
        double amount = 12618.98;
double interestRate = 0.0013;
double interest = amount * interestRate;
System.out.println("Interest is $" + interest);
System.out.printf("Interest is $%4.4f",
 interest);
 int count = 5;
double amt = 45.56;
System.out.printf("count is %d and amount is %f", count, amt);
    }
}
