import java.util.*;
public class A7Q10 {
    public static int[] eliminateDuplicates(int[] list){
        int dis[]=new int[list.length];
        int c=0;
        for(int i=0;i<list.length;i++){
            boolean dup=false;
            for(int j=0;j<c;j++){
                if(list[i]==dis[j]){
                    dup=true;
                    break;
                }
            }
            if(!dup)
                dis[c++]=list[i];
        }
        int res[]=new int[c];
        for(int i=0;i<c;i++)
            res[i]=dis[i];
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter 10 integers: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();
        int r[]=eliminateDuplicates(a);
        System.out.print("The distinct elements are: ");
        for(int i=0;i<r.length;i++)
            System.out.print(r[i]+" ");
        System.out.println();
        sc.close();
    }
}
