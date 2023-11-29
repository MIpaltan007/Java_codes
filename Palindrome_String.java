import java.util.*;
public class Palindrome_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        if(s.equals(rev)){
            System.out.println("Yes,Its a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
sc.close();
    }
}
