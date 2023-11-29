import java.util.Scanner;

class Complex{
    int real,imag;

    //constructor
    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void print(){
        System.out.println(this.real+" + "+this.imag+"i");
    }
    Complex add(Complex y){
        int sumreal=this.real+y.real;
        int sumimg=this.imag+y.imag;
        Complex res=new Complex(sumreal, sumimg);
        return res;
    }
    public String toString(){
        //return "This is a complex number";
        return this.real+" + "+this.imag+"i";
    }
}
public class this_keyword {
     public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number Real Part");
    int a=sc.nextInt();
   
    System.out.println("Enter 1st number Imaginary Part");
    int b=sc.nextInt();
 Complex x=new Complex(a,b);
 System.out.println(x); //using toString method,no need for print method
 //x.print();
 System.out.println("Enter 2nd number real part");
 int c=sc.nextInt();
 System.out.println("Enter 2nd number imaginary part");
 int d=sc.nextInt();
 Complex y=new Complex(c, d);
 System.out.println(y);// using toString method
 //y.print();
 Complex z=x.add(y);
 System.out.println(z); //using toString method
 //z.print();
    

   //to string
   System.out.println(x);
   System.out.println(y);
   System.out.println(z);
   sc.close();
    }
}
