import java.util.*;
public class String_and_char_arrays {
    public static void main(String[] args){
           String str="hello";
           char[]arr={'h','e','l','l','o'};
           System.out.println(str);
           System.out.println(arr);
           char[] arr2=str.toCharArray();
           System.out.println(arr2);
           String s=new String(arr);
           System.out.println(s);
    }
}
