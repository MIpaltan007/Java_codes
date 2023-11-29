import java.util.*;
public class Regular_Expression {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         String[] tokens="Java#HTML#Perl".split("#",0);
         for(int i=0;i<tokens.length;i++){
            System.out.print(tokens[i]+" ");
         }
         System.out.println();
         String s="a+b$#c".replaceAll("[+$#]", "NNN");
         System.out.println(s);
         String[] t="Java,C:C++;C#".split("[,:;?.]");
         for(int i=0;i<t.length;i++){
            System.out.print(t[i]);
         }
         System.out.println();
         String str=new String("Welcome To Tutorialspoint.com");
         System.out.println(str.matches("(.*)Welcome(.*)"));
         System.out.println(str.matches("(.*)Tutorials(.*)"));
         System.out.println(str.matches("Tutorials"));
         System.out.println("Java".matches("Java"));
         System.out.println("Java".equals("Java"));
         System.out.println("Java is fun".matches("Java.*"));
         System.out.println("Java is cool".matches("Java.*"));
    }
}
