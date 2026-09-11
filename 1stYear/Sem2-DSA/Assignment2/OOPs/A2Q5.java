/*
Problem Statement:
Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a java program to display area of different shapes.
*/

import java.util.Scanner;
abstract class Shape{
    abstract void area();
}
class Square extends Shape{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side: ");
        double s=sc.nextDouble();
        System.out.println("Area of Square: "+s*s);
    }
}
class Triangle extends Shape{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side1: ");
        double s1=sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2=sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3=sc.nextDouble();
        double s=(s1+s2+s3)/2;
        System.out.println("Area of Triangle: "+Math.sqrt((s-s1)*(s-s2)*(s-s3)));
    }
}
class Circle extends Shape{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        System.out.println("Area of Circle: "+Math.PI*r*r);
    }
}
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape ob=new Square();
        ob.area();
        ob=new Triangle();
        ob.area();
        ob=new Circle();
        ob.area();
    }
}