import java.util.Scanner;
public class A4Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x=sc.nextInt();
		System.out.print("Enter the second number: ");
		int y=sc.nextInt();
		int a=x,b=y;
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		System.out.println("GCD of "+a+" and "+b+" is "+x);
		sc.close();
	}
}