import java.util.Scanner;

public class Series {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r=2*b,e=a+b;
            for(int j=0;j<n;j++){
                System.out.print(e+" ");
                
                e=e+r;
                r=r*2;
                
            }
            System.out.println();
        }
        in.close();
    }
}
