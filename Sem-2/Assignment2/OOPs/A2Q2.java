/*
Problem Statement:
Define a class called Complex with instance variables real, imag and instance methods
• void setData ()
• void display ()
• public Complex add (Complex, Complex)
Write the main method in a separate class to implement the addition of two complex number with the given method signature as above.
*/

import java.util.Scanner;
class Complex{
    int real,img;
    void setData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real: ");
        real=sc.nextInt();
        System.out.print("Enter img: ");
        img=sc.nextInt();
    }
    void display(){
        System.out.println(real+"+"+img+"i");
    }
    public Complex add(Complex C1,Complex C2){
        Complex C=new Complex();
        C.real=C1.real+C2.real;
        C.img=C1.img+C2.img;
        return C;
    }
}
public class A2Q2 {
    public static void main(String[] args) {
        Complex C1=new Complex();
        Complex C2=new Complex();
        C1.setData();
        C2.setData();
        C1.display();
        C2.display();
        Complex C=new Complex();
        C=C.add(C1,C2);
        C.display();
    }
}