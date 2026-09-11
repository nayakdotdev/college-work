import java.util.Scanner;
public class A6Q5 {
	public static int collatzLength(int n) {
		int c=0;
		while(n>0) {
			if(n==1)
				return c;
			else if(n%2==0)
				n=n/2;
			else
				n=3*n+1;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Collatz length: "+collatzLength(n));
		sc.close();
	}
}