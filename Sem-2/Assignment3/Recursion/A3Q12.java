import java.util.Scanner;
public class A3Q12 {
    public static int binarySearch(int[] a,int k){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(a[m]==k)
                return m;
            else if(a[m]>k)
                r=m-1;
            else
                l=m+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter element to be searched: ");
        int t=sc.nextInt();
        System.out.println("Element found at: "+binarySearch(arr,t));
        sc.close();
    }
}