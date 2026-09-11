/*
Problem Statement:
Write a recursive method in Java to find the product of 2 numbers.
*/

import java.util.Scanner;
public class A3Q14 {
    public static int product(int a,int b){
        if(a<b)
            return product(b,a);
        else if(b!=0)
            return a+product(a,b-1);
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();
        System.out.println("Product of "+a+" and "+b+" is "+product(a,b));
        sc.close();
    }
}