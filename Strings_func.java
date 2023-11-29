import java.util.*;
public class Strings_func {
    public static void main(String[] args){
       String s1="Welcome".toLowerCase();
       System.out.println(s1);
       String s2="Welcome".toUpperCase();
       System.out.println(s2);
       String s3="  Welcome  ".trim();
       System.out.println(s3);
       String s4="Welcome".replace('e','A');
       System.out.println(s4);
       String s5="Welcome".replaceFirst("e","AB");
       System.out.println(s5);
       String s6="Welcome".replaceAll("e","AB");
       System.out.println(s6);
       String s7="Welcome".replaceAll("el","AB");
       System.out.println(s7);

       String[] tokens="Java#HTML#Perl".split("#",0);
       for(int i=0;i<tokens.length;i++){
        System.out.print(tokens[i] +" ");
       }
        System.out.println("Java".matches("Java"));
        String s="a+b$#c".replaceAll("[$+#]","NNN");
        System.out.println(s);
        //String[] tokens="Java,C?C#,C++".split("[.,:;?]");
        
       }
    }

