import java.util.*;
public class A7Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter 10 integers: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        int res[]=new int[10];
        int k=0;
        for(int i=0;i<10;i++){
            if(a[i]==0)
                res[k++]=0;
        }
        for(int i=0;i<10;i++){
            if(a[i]!=0)
                res[k++]=a[i];
        }
        System.out.println("After moving all zeros to the beginning:");
        for(int i=0;i<10;i++)
            System.out.print(res[i]+" ");
        System.out.println();
        sc.close();
    }
}
