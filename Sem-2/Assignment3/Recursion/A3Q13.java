/*
Problem Statement:
Write a recursive method in Java to find the binary equivalent of a positive decimal integer.
*/

import java.util.Scanner;
public class A3Q13 {
    public static int binary(int n){
        if(n==0)
            return 0;
        else
            return n%2+10*binary(n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int n=sc.nextInt();
        System.out.println("Binary Equivalent is "+binary(n));
        sc.close();
    }
}