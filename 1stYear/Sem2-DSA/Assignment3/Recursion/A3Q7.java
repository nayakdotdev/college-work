/*
Problem Statement:
Write a recursive method in Java that computes the factorial of a given integer.
*/

import java.util.Scanner;
public class A3Q7 {
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
        sc.close();
    }
}