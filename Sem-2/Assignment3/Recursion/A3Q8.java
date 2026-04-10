import java.util.Scanner;
public class A3Q8 {
    public static int power(int x,int n){
        if(n==0)
            return 1;
        else
            return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println(x+" to the power "+n+" is "+power(x,n));
        sc.close();
    }
}