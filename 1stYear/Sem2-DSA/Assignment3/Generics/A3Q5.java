/*
Problem Statement:
Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
        public static < E > void printArray( E[] inputArray)
*/

import java.util.Scanner;
public class A3Q5{
    public static <E> void printArray(E[] inputArray){
        for(int i=0;i<inputArray.length;i++)
            System.out.print(inputArray[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Creating a Integer Array:");
        Integer a[]=new Integer[5];
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        printArray(a);
        System.out.println("Creating a String Array:");
        String b[]=new String[5];
        for(int i=0;i<5;i++)
            b[i]=sc.next();
        printArray(b);
        sc.close();
    }
}