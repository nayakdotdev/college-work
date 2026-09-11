import java.util.Scanner;
public class A6Q8 {
	public static int largestDigit(int n) {
		int m=Integer.MIN_VALUE;
		while(n>0) {
			int d=n%10;
			m=Math.max(m,d);
			n/=10;
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		System.out.println("Largest digit: "+largestDigit(n));
		sc.close();
	}
}