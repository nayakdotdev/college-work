/*
Problem Statement:
Write a Java program that can take a positive integer greater than 2 as input and write out the number of times one must repeatedly divide this number by 2 before getting a value less than 2.
Sample Run:
The positive integer greater than 2 from command line argument is 67.
The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is 5.
*/

import java.util.*;
public class A1Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int c=0;
        while(n>=2){
            n/=2;
            c++;
        }
        System.out.println("It should be divided "+c+" times.");
        sc.close();
    }
}