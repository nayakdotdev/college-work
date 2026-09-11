import java.util.*;
public class A7Q6 {
    public static void readArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" values:");
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
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        readArray(a);
        System.out.println("Maximum Element: "+findMax(a));
        System.out.println("Its occurs "+countOccurrences(a,findMax(a))+" time(s)");
        System.out.println("First position of maximum: "+firstPositionOfMax(a,findMax(a)));
        System.out.println("Minimum Element: "+findMin(a));
        System.out.println("Its occurs "+countOccurrences(a,findMin(a))+" time(s)");
        System.out.println("Last position of minimum: "+lastPositionOfMin(a,findMin(a)));
        sc.close();
    }
}
