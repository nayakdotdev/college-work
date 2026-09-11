/*
Problem Statement:
Given an unsorted array, A, of integers and an integer k, write recursive program using Java
for rearranging the elements in A so that all elements less than or equal to k come before
any elements larger than k.
*/

import java.util.Scanner;
public class A3Q17 {
    public static void rearrange(int a[],int l,int r,int k){
        if(l>=r)
            return;
        else if(a[l]<=k)
            rearrange(a,l+1,r,k);
        else if(a[r]>k)
            rearrange(a,l,r-1,k);
        else{
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            rearrange(a,l+1,r-1,k);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Creating 10 Size Integer Array");
        int a[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k=sc.nextInt();
        System.out.println("Before Rearrange:");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        rearrange(a,0,a.length-1,k);
        System.out.println("After Rearrange:");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
        sc.close();
    }
}