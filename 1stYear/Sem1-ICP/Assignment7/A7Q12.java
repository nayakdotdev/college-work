import java.util.*;
public class A7Q12 {
    public static void bubbleSort(double[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter 10 values: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextDouble();
        bubbleSort(a);
        System.out.println("Sorted Array:");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        sc.close();
    }
}
