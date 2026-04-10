import java.util.Scanner;
public class A3Q11 {
    public static int gcd(int m,int n){
        if(n==0)
            return m;
        else
            return gcd(n,m%n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m: ");
        int m=sc.nextInt();
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("GCD of "+m+" & "+n+" is "+gcd(m,n));
        sc.close();
    }
}