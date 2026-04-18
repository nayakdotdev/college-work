/*
Problem Statement:
Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements.
*/

import java.util.*;
public class A1Q14 {
    public static double[][] addMatrix(double[][] a, double[][] b){
        if(a.length!=b.length||a[0].length!=b[0].length)
            System.out.println("Incompatible");
        int m=a.length,n=a[0].length;
        double ans[][]=new double[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                ans[i][j]=a[i][j]+b[i][j];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[][]=new double[2][2];
        double b[][]=new double[2][2];
        System.out.println("Enter 1st Array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Enter 2nd Array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                b[i][j]=sc.nextInt();
        }
        double c[][]=addMatrix(a,b);
        System.out.println("Sum Array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}