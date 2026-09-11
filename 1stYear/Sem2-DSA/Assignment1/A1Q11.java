/*
Problem Statement:
Write a Java program that takes as input three integers, a, b, and c, from the Java console and determines if they can be used in a correct arithmetic formula (in the given order), like “a + b = c,” “a = b − c,” or “a b = c.”∗
*/

import java.util.*;
public class A1Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean p=false;
        if((a+b==c)||(b-c==a)||(a*b==c))
            p=true;
        System.out.println("Can they be used in given arithmetic formula: "+p);
        sc.close();
    }
}