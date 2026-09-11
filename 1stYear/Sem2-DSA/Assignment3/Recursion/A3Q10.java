/*
Problem Statement:
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the nth Fibonacci number.
*/

import java.util.Scanner;
public class A3Q10 {
    public static int fibo(int n){
        if(n==1||n==0)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println(n+"th Fibonacci is "+fibo(n));
        sc.close();
    }
}