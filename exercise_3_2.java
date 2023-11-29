import java.util.*;
public class exercise_3_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d1=(int)(Math.random()*10);
        int d2=(int)(Math.random()*10);
        int d3=(int)(Math.random()*10);
        System.out.println(d1+" + "+d2+" + "+d3+" is ?");
        int answer=sc.nextInt();
        System.out.println(d1+" + "+d2+" + "+d3+" = "+answer+" is "+(d1+d2+d3==answer));

    }
}
