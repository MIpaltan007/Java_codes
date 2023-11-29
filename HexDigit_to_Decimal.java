import java.util.*;
public class HexDigit_to_Decimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hex Digit");
        String a=sc.nextLine();
        char ch=a.charAt(0);
        if(a.length()!=1){
            System.out.println("Enter Valid Input");
            System.exit(1);
        }
    
        if(ch>='A' && ch<='F'){
            int value=ch-'A'+10;
            System.out.println("Decimal Value = "+value);
        }
        else if(Character.isDigit(ch)){
            System.out.println("Decimal Value = "+ch);
        }
        else{
            System.out.println("Enter Valid Input");
        }

    }
}
