import java.util.*;
public class A7Q3 {
    public static void readArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" integers:");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        sc.close();
    }
    public static int countOccurrences(int[] arr, int key){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        readArray(a);
        System.out.print("Enter the number to search: ");
        int n=sc.nextInt();
        System.out.println("The number "+n+" appears "+countOccurrences(a,n)+" time(s) in the array.");
        sc.close();
    }
}
