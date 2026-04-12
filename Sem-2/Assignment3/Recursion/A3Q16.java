/*
Problem Statement:
Write a recursive Java method that determines if a string s is a palindrome, that is, it is
equal to its reverse. Examples of palindromes include 'racecar' and
'gohangasalamiimalasagnahog'.
*/

import java.util.Scanner;
public class A3Q16 {
    public static boolean palindrome(String s,int i,int j){
        if(i>=j)
            return true;
        else if(s.charAt(i)!=s.charAt(j))
            return false;
        return palindrome(s,i+=1,j-=1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check: ");
        String s=sc.next();
        System.out.println(s+" is Palindrome: "+palindrome(s,0,s.length()-1));
        sc.close();
    }
}