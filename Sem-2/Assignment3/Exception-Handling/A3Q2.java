/*
Problem Statement:
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.
*/

import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 4 favourite colours:");
        String s[]=new String[4];
        for(int i=0;i<4;i++)
            s[i]=sc.next();
        try{
            int x=Integer.parseInt(s[0]);
        }
        catch(NumberFormatException ob){
            System.out.println(ob);
        }
        try{
            s[5]=sc.next();
        }
        catch(ArrayIndexOutOfBoundsException ob1){
            System.out.println(ob1);
        }
        finally{
            System.out.println("Program Over!");
            sc.close();
        }
    }
}