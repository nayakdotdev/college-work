/*
Problem Statement:
Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
*/

import java.util.Scanner;
public class A3Q1 {
    public static void checkLucky(int n){
        if(n>=0)
            System.out.println("My Lucky Number is "+n);
        else
            throw new NumberFormatException("Number can't be negative");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Lucky Number: ");
        int n=sc.nextInt();
        try{
            checkLucky(n);
        }
        catch(NumberFormatException ob){
            System.out.println(ob.getMessage());
        }
        finally{
            System.out.println("Program Over!");
            sc.close();
        }
    }
}