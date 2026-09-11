import java.util.Scanner;
public class A5Q11 {
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x=sc.nextInt();
		System.out.print("Enter the second number: ");
		int y=sc.nextInt();
		for(int i=x;i<=y;i++) {
			if(isPrime(i)==true)
				System.out.print(i+" ");
		sc.close();
		}
	}
}