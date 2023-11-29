import java.util.*;
public class Func_hex_dec {
    public static String toHex(int d){
        int r=0;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(d>0){
            r=d%16;
            hex=hexchars[r]+hex;
            d/=16;
        }
        return hex;
    }
    public static int toDec(String h){
        String digits="0123456789ABCDEF";
        h=h.toUpperCase();
        int i,val=0;
        for(i=0;i<h.length();i++){
            char c=h.charAt(i);
            int a=digits.indexOf(c);
            val=val*16 + a;
        }
        return val;
    }
