import java.util.*;
public class Exercise_3_21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of month");
        int q=sc.nextInt();
        System.out.println("Enter Month");
        int m=sc.nextInt();
       
        System.out.println("Enter Year");
        int y=sc.nextInt();
         if(m==1||m==2){
            m=m+12;
            y=y-1;
        }
        int j=y/100;
        int k=y%100;
        int h=(q + ((26*(m+1))/10) + k + (k/4) + (j/4) + 5*j)%7;
        switch(h){
            case 0:
            System.out.println("Saturday");
            break;
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");

        }
        sc.close();
    }
}
