/*
Problem Statement:
Write a java program to find the maximum and minimum and how many times they both occur in an array of n elements. Find out the positions where the maximum first occurs and the minimum last occurs.
Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.
*/

import java.util.*;
public class A1Q7 {
    public static void readArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        sc.close();
    }
    public static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            mx=Math.max(mx,arr[i]);
        return mx;
    }
    public static int findMin(int[] arr){
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
            mn=Math.min(mn,arr[i]);
        return mn;
    }
    public static int countOccurrences(int[] arr, int value){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value)
                c++;
        }
        return c;
    }
    public static int firstPositionOfMax(int[] arr, int max){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                pos=i+1;
                break;
            }
        }
        return pos;
    }
    public static int lastPositionOfMin(int[] arr, int min){
        int pos=-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==min){
                pos=i+1;
                break;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        readArray(a);
        System.out.println("Maximum element of Array is "+findMax(a)+" and occurs "+countOccurrences(a,findMax(a))+" time(s)");
        System.out.println("Minimum element of Array is "+findMin(a)+" and occurs "+countOccurrences(a,findMin(a))+" time(s)");
        System.out.println("First occurrence of maximum element is at position "+firstPositionOfMax(a,findMax(a)));
        System.out.println("Last occurrence of minimum element is at position "+lastPositionOfMin(a,findMin(a)));
        sc.close();
    }
}