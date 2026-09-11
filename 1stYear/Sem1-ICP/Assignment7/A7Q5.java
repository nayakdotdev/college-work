import java.util.*;
public class A7Q5 {
    public static int findSecondLargest(int[] arr){
        int l=Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl&&arr[i]!=l)
                sl=arr[i];
        }
        return sl;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.println("The second largest element is: "+findSecondLargest(a));
        sc.close();
    }
}
