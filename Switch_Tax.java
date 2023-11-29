import java.util.*;

public class Switch_Tax {
    public static void main(String[] args){
        Scanner sky=new Scanner(System.in);
        System.out.println("Enter Your Taxable Income");
        double a=sky.nextDouble();
        System.out.println("Choose Your Option-");
    System.out.println("0-> Single\n1->Married Jointly or Qualified Widower\n2-> Married Filling Separately\n3->Head of Household");
    int b=sky.nextInt();
    double totaltax=0;
    if(b==0){
        if(a<=8350){
            totaltax=a*0.10;
        }
        else if(a<=33950){
            totaltax=(a-8350)*0.15+8350*0.10;
        }
        else if(a<=82250){
            totaltax=8350*10+(33950-8350)*0.15+(a-33950)*0.25;
        }
        else if(a<=171550){
            totaltax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(a-82250)*0.28;

        }
        else if(a<=372950){
            totaltax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(a-171550)*0.33;
        }
        else{
            totaltax=8350*0.10+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(a-372950)*0.35;
        }
    }
    
        sky.close();
    }
}
