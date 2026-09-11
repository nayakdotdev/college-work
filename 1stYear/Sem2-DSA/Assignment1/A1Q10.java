/*
Problem Statement:
Write a method that returns the sum of all the elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
Sample Run:
Enter a 3-by-4 matrix row by row: 1.5 2 3 4 5.5 6 7 8 9.5 1 3 1 Sum of the elements at column 0 is 16.5 Sum of the elements at column 1 is 9.0 Sum of the elements at column 2 is 13.0 Sum of the elements at column 3 is 13.0
Home Assignment
*/

import java.util.*;
public class A1Q10 {
    public static double sumColumn(double[][] m, int columnIndex){
        double s=0;
        for(int i=0;i<m.length;i++)
            s+=m[i][columnIndex];
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[][]=new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
                a[i][j]=sc.nextDouble();
        }
        System.out.println("Sum of the elements at column 0 is "+sumColumn(a,0));
        System.out.println("Sum of the elements at column 1 is "+sumColumn(a,1));
        System.out.println("Sum of the elements at column 2 is "+sumColumn(a,2));
        System.out.println("Sum of the elements at column 3 is "+sumColumn(a,3));
        sc.close();
    }
}