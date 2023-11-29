import java.util.*;
public class HexaDecimal_to_Decimal_and_viceversa_conversion {
    public static int hexTodecimal(String hex){
        int decimalvalue=0,i;
        for(i=0;i<hex.length();i++){
            char hexchar=hex.charAt(i);
            decimalvalue=decimalvalue*16 + hecCharToDecimal(hexChar);
        }
        return decimalvalue;
        
    }
    public static int hexCharToDecimal(char ch){
        if(ch>='A' && ch<='F')
           return 10+ch-'A';
        else
           return ch-'0';
    }
    public static String toHex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0){
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;
    }
}
