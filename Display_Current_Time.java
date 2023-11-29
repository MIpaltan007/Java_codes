import java.util.*;
public class Display_Current_Time {
    public static void main(String[] args){
        /*long totalmillisec=System.currentTimeMillis();
        long totalsec=totalmillisec/1000;
        long currsec=totalsec%60;
        long totalmin=totalsec/60;
        long currmin=totalmin%60;
        long totalhrs=totalmin/60;
        long currhr=totalhrs%24;
        System.out.println("Current Time = "+currhr+":"+currmin+":"+currsec+" In GMT");
        */
        Scanner sc=new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
 
  // Obtain the total seconds since midnight, Jan 1, 1970
  long totalSeconds = totalMilliseconds / 1000;
 
// Compute the current second in the minute in the hour
 long currentSecond = totalSeconds % 60;
 long totalMinutes = totalSeconds / 60;

 // Compute the current minute in the hour
 long currentMinute = totalMinutes % 60;
 // Obtain the total hours
 long totalHours = totalMinutes / 60;

 // Compute the current hour
 long currentHour = totalHours % 24;
System.out.println("Enter Offset Hour");
int a=sc.nextInt();

System.out.println("Enter Offset minutes");
int b=sc.nextInt();
currentHour+=a;
currentMinute+=b;

// Display results
System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
