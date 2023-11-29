import java.util.*;
public class Major_and_status {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(s.charAt(0)=='M'){
        System.out.print("Mathematics ");
    }
    else if(s.charAt(0)=='C'){
        System.out.print("Computer Science");
    }
    else if(s.charAt(0)=='I'){
        System.out.print("Information Technology");
    }
    if(s.charAt(1)=='1'){
        System.out.print("Freshman");
    }
    else if(s.charAt(1)=='2'){
        System.out.print(" Sophomore");
    }
    else if(s.charAt(1)=='3'){
        System.out.print("Junior");
    }
    else if(s.charAt(1)=='4'){
        System.out.print("Senior");
    }
    sc.close();
    }
}
