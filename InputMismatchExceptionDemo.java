import java.util.*;
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continueInput=true;
        do{
            try{
                System.out.print("Enter an integer:");
                int num=sc.nextInt();
                System.out.println("The number entered is "+num);
                continueInput=false;
            }
            catch(InputMismatchException ex){
                 System.out.println("Try Again, (" + "Incorrect input: an integer is required)");
                 sc.nextLine();
            }
        }while(continueInput);
        }
    }

