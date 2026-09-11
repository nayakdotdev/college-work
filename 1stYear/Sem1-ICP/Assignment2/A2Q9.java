import java.util.Scanner;
public class A2Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,ld,s=0;
		System.out.print("Enter a number between 0 and 1000: ");
		n=sc.nextInt();
		if(n>9&&n<100) {
			ld=n%10;
			s+=ld;
			n/=10;
			ld=n%10;
			s+=ld;
		}
		else if(n>99&&n<1000) {
			ld=n%10;
			s+=ld;
			n/=10;
			ld=n%10;
			s+=ld;
			n/=10;
			ld=n%10;
			s+=ld;
		}
		else
			s=n;
		System.out.println("The sum of the digits is "+s);
		sc.close();
	}
}