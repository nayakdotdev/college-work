import java.util.Scanner;
public class A5Q12 {
	public static int fact(int n) {
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		int m=sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++) {
			System.out.println("Factorial of "+i+" is: "+fact(i));
		}
		sc.close();
	}
}