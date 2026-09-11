import java.util.Scanner;
public class A5Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int c1=1,c2=1;
		for(int i=2;i<=n1;i++) {
			if(n1%i==0)
				c1++;
		}
		for(int i=2;i<=n2;i++) {
			if(n2%i==0)
				c2++;
		}
		if(c1>c2) {
			System.out.println("The number with the most divisors is "+n1);
			System.out.println("Number of divisors: "+c1);
		}
		else if(c2>c1) {
			System.out.println("The number with the most divisors is "+n2);
			System.out.println("Number of divisors: "+c2);
		}
		else {
			System.out.println("The number with the most divisors is "+Math.max(n1,n2));
			System.out.println("Number of divisors: "+c1);
		}
		sc.close();
	}
}