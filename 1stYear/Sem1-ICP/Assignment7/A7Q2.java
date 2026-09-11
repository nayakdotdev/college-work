import java.util.*;
public class A7Q2 {
    static Scanner sc=new Scanner(System.in);
    public static void readInput(int[] counts){
        System.out.print("Enter integers between 1 and 100: ");
        while(true){
            int n=sc.nextInt();
            if(n==0)
                return;
            else
                counts[n]++;
        }
    }
    public static void displayCounts(int[] counts){
        for(int i=1;i<=100;i++){
            if(counts[i]!=0){
                if(counts[i]==1)
                    System.out.println(i+" occurs "+counts[i]+" time.");
                else
                    System.out.println(i+" occurs "+counts[i]+" times.");
            }
        }
    }
    public static void main(String[] args) {
        int a[]=new int[101];
        readInput(a);
        displayCounts(a);
    }
}
