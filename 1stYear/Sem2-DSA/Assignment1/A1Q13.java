/*
Problem Statement:
Write a Java program that takes two arrays a and b of length n storing int values, and returns the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
*/

import java.util.*;
public class A1Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Length of Array A & B: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter elements of Array A:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter elements of Array B:");
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        System.out.println("Array C:");
        for(int i=0;i<n;i++)
            System.out.println(a[i]*b[i]);
        sc.close();
    }
}