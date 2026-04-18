/*
Problem Statement:
Write a Java program that takes all the lines input to standard input and writes them to standard output in reverse order. That is, each line is output in the correct order, but the ordering of the lines is reversed.
*/

import java.util.*;
public class A1Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.err.println("Output: ");
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        sc.close();
    }
}