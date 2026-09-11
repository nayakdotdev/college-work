import java.util.Scanner;
public class A5Q15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n (n > 3): ");
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i=4;i<=n;i++){
            int d=a+b+c;
            System.out.print(d+" ");
            a=b;
            b=c;
            c=d;
        }
		sc.close();
    }
}