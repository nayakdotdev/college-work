import java.util.Scanner;
public class A4Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int x=n,rev=0,d=0;
		while(x>0) {
			d=x%10;
			rev=rev*10+d;
			x/=10;
		}
		System.out.println("Reversed number: "+rev);
		if(n==rev)
			System.out.println(n+" is a palindrome.");
		else
			System.out.println(n+" is not a palindrome.");
		sc.close();
	}
}