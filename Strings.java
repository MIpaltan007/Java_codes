import java.util.*;

public class Strings {
    public static void main(String[] args){
        String s="Hello";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println("Hello World".length());
        String s1=new String("Hello");
        if(s.equals(s1)){
            System.out.println("Strings are equal");
        }
        System.out.println(s1.contains("ell"));
        System.out.println(s.toUpperCase());
        String s2="I love Programming, Programming is awesome";
        String s3=s2.replace("Programming","Java");
        System.out.println(s2);
        System.out.println(s3);
        String s4=s2.substring(7);
        System.out.println(s4);
        String s5=s+" "+s2;
        System.out.println(s5);
        int a=5;
        System.out.println(s+a);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
