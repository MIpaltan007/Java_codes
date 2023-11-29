import java.util.*;
class Complex{
    int real,imag;

    //constructor
    Complex(int r,int i){
        real=r;
        imag=i;
    }
    void print(){
        System.out.println(real+" + "+imag+"i");
    }
    Complex add(Complex y){
        int sumreal=real+y.real;
        int sumimg=imag+y.imag;
        Complex res=new Complex(sumreal, sumimg);
        return res;
    }
}
public class Complex_Numbers {
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number Real Part");
    int a=sc.nextInt();
   
    System.out.println("Enter 1st number Imaginary Part");
    int b=sc.nextInt();
 Complex x=new Complex(a,b);
 x.print();
 System.out.println("Enter 2nd number real part");
 int c=sc.nextInt();
 System.out.println("Enter 2nd number imaginary part");
 int d=sc.nextInt();
 Complex y=new Complex(c, d);
 y.print();
 Complex z=x.add(y);
 z.print();
    // x.real=a;
   // x.imag=b;
    //System.out.println(x.imag);
   // System.out.println(x.real);
   //x.print();
   sc.close();
    }
}
