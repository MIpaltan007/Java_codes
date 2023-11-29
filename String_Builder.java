import java.util.*;
public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("I Love Programming");
       // System.out.println(sb);
       sb.append(" and Coffee");
       System.out.println(sb);
       sb.insert(18,",Gaming");
       System.out.println(sb);
       sb.replace(2, 6,"Like");
       System.out.println(sb);
       sb.delete(7,19);
       System.out.println(sb);
       String str=sb.toString();
       System.out.println(str);
    }
}
