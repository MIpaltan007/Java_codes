//package chapter4;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Usage: Java Calculator Operand1 Operand Operand2");
            System.exit(0);
        }
        int result=0;
        switch(args[1].charAt(0)){
            case '+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
            break;
            case '-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
            break;
            case '.':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
            break;
            case '/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
        }
        System.out.println(args[0]+' '+args[1]+' '+args[2]+"="+result);
    }
}
