import java.util.*;
public class LoanClass {
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         double annualInterestRate = input.nextDouble();

         System.out.println("Enter number of years as an integer:");
         int numberOfYears=input.nextInt();
         System.out.println("Enter Loan Amount for example, 120000.95:");
         double loanAmount=input.nextDouble();
         LoanClass loan=new LoanClass(annualInterestRate,numberOfYears,loanAmount);
         System.out.println("The Loan was created on %s\n"+"The Monthly Payment is %.2f\nThe Total Payment is %.2f\n"
         loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}
