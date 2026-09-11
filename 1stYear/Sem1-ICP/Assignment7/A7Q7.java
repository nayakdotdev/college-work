import java.util.*;
public class A7Q7 {
    public static void readArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter "+arr.length+" numbers: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        sc.close();
    }
    public static void rotateClockwise(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        readArray(a);
        System.out.println("Array elements before clock-wise rotation:");
        printArray(a);
        rotateClockwise(a);
        System.out.println("Array elements after clock-wise rotation:");
        printArray(a);
    }
}
