/*
Problem Statement:
Write a recursive Java method that takes a character string s and outputs its reverse. For
example, the reverse of 'pots&pans' would be 'snap&stop'.
*/

import java.util.Scanner;
public class A3Q15 {
    public static String reverse(String s){
        if(s.length()<=1)
            return s;
        else
            return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.next();
        System.out.println("Reverse of "+s+" is "+reverse(s));
        sc.close();
    }
}