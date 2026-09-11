/*
Problem Statement:
Write a java program to check whether a number is a spy number or not.
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.
Sample Run:
Enter a number: 1124
1124 is a spy number.
*/

import java.util.*;
public class A1Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int s=0,p=1;
        while(n>0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        if(s==p)
            System.out.println("It is a Spy Number.");
        else
            System.out.println("It is NOT a Spy Number.");
        sc.close();
    }
}