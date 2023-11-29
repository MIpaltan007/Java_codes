
import java.util.*;
public class Calender_of_a_month {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter full year");
        int year=input.nextInt();
        System.out.println("Enter months in between 1 to 12");
        int month=input.nextInt();
        printMonth(year,month);
    }
    public static void printMonth(int year,int month){
        printMonthTitle(year,month);
        printMonthbody(year,month);

    }
    public static void printMonthTitle(int year,int month){
        System.out.println("              "+getMonthName(month)+"   "+year);
        System.out.println("-------------------------------------");
        System.out.println(" Sun  Mon  Tue  Wed  Thurs  Fri  Sat ");

    }
    public static String getMonthName(int month){
        String monthname="";
        switch(month){
            case 1:monthname="January"; break;
            case 2:monthname="February";break;
            case 3:monthname="March";break;
            case 4:monthname="April";break;
            case 5:monthname="May";break;
            case 6:monthname="June";break;
            case 7:monthname="July";break;
            case 8:monthname="August";break;
            case 9:monthname="September";break;
            case 10:monthname="October";break;
            case 11:monthname="November";break;
            case 12:monthname="December";break;

        }
        return monthname;
    }
    public static void printMonthbody(int year,int month){
        int startday=getStartDay(year,month);
        int numberofDaysinMonth=getNumberOfDaysInMonth(year,month);
        int i=0;
        for(i=0;i<startday;i++){
            System.out.print("   ");
        }
        for(i=1;i<=numberofDaysinMonth;i++){
            System.out.printf("%4d",i);
        }
        if((i+startday)%7==0){
            System.out.println();
        }
        System.out.println();
    }
    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800=3;
        int totalNumberofDays=getTotalNumberofDays(year,month);
        return (totalNumberofDays+START_DAY_FOR_JAN_1_1800)%7;
    }
    public static int getTotalNumberofDays(int year,int month){
        int total=0,i;
        for(i=1800;i<year;i++)
        if(isLeapYear(i))
            total=total+366;
        
        else
            total=total+365;
        
            for(i=1;i<month;i++)
            total=total+getNumberOfDaysInMonth(year,i);
            return total;
    }
    public static int getNumberOfDaysInMonth(int year,int month){
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        return 31;

        if(month==4||month==6||month==9||month==11)
        return 30;

        if(month==2) return isLeapYear(year)? 29:28;

        return 0;
     }
     public static boolean isLeapYear(int year){
        return (year%400==0||(year%4==0 && year%100!=0));
     }
     //input.close();
}
