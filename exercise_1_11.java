import java.util.*;
public class exercise_1_11 {
    public static void main(String[] args){
        int c=312032486;
        int i;
        /*for(i=1;i<=365*5*86400;i++){
            if(i%7==0||i%45==0){
                c++;
            }
            else if(i%13==0){
                c--;
            }
        }
        System.out.println("Population After 5 years = "+c);
        */
        int t=31536000;
        for(i=1;i<=5;i++){
        System.out.println("Year "+i+" Projection");
        System.out.println(c+(((t/7)-(t/13)+(t/45))*i));
        System.out.println();
        }

    }
}
