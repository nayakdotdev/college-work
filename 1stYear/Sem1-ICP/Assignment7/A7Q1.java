import java.util.*;
public class A7Q1{
    public static int findSum(int[] arr){
        int s=0;
        for(int i=0;i<arr.length;i++)
            s+=arr[i];
        return s;
    }
    public static double findAverage(int[] arr){
        double avg=findSum(arr)/arr.length;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Random values stored in the array: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Sum of elements = "+findSum(a));
        System.out.println("Average of elements = "+findAverage(a));
        sc.close();
    }
}