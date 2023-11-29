import java.util.*;
public class Switch_Days_in_a_month {
    public static void main(String [] args){
        Scanner sky=new Scanner(System.in);
        int a=sky.nextInt();
        switch(a){
            case 1:
            System.out.println("31 Days");
            break;
            case 2:
            System.out.println("28 or 29 days");
            break;
            case 3:
            System.out.println("31 Days");
            break;
            case 4:
            System.out.println("30 Days");
            break;
            case 5:
            System.out.println("31 Days");
            break;
            case 6:
            System.out.println("30 Days");
            break;
            case 7:
            System.out.println("31 Days");
            break;
            case 8:
            System.out.println("31 Days");
            break;
            case 9:
            System.out.println("30 Days");
            break;
            case 10:
            System.out.println("31 Days");
            break;
            case 11:
            System.out.println("30 Days");
            break;
            default:
            System.out.println("31 Days");
        }
        sky.close();
    }
}
