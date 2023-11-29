import java.util.Scanner;

public class Random_num_subtraction {
    public static void main(String[] args){
        int num1=(int)(System.currentTimeMillis()*10);
        int num2=(int)(System.currentTimeMillis()*10);

        Scanner input=new Scanner(System.in);
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
       // System.out.println("Result="+(3+4*4 > 5*(4+3)));
        System.out.println("What is "+num1+" - "+num2+" ? ");
        int answer=input.nextInt();
        System.out.println(num1+" - "+num2+" = "+answer+" is "+(num1-num2==answer));
        input.close();
    }
}
