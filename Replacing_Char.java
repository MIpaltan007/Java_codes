import java.util.*;
public class Replacing_Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=sc.nextInt();
        char b=s.charAt(a-1);
        String s1=s.replace(b,'$');
        System.out.println(s1);
        sc.close();

    }
}
