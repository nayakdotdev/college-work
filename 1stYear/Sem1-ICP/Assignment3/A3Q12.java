import java.util.Scanner;
public class A3Q12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a,b,c: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Using nested if–else statements:-");
		if(a>b) {
			if(a>c)
				System.out.println("Largest number: "+a);
			else
				System.out.println("Largest number: "+c);
		}
		else {
			if(b>c)
				System.out.println("Largest number: "+b);
			else
				System.out.println("Largest number: "+c);
		}
		System.out.println("Using if–else if ladder:-");
		if(a>b&&a>c)
			System.out.println("Largest number: "+a);
		else if(b>a&&b>c)
			System.out.println("Largest number: "+b);
		else if(c>a&&c>b)
			System.out.println("Largest number: "+c);
		System.out.println("Using the conditional (ternary) operator:-");
		System.out.println("Largest number: "+((a>b)?((a>c)?a:c):((b>c)?b:c)));
		sc.close();
	}
}