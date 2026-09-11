import java.util.Scanner;
public class A4Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int x=n,s=0,d=0;
		while(x>0) {
			d=x%10;
			s+=d;
			x/=10;
		}
		if(s%9==0)
			System.out.println("The number "+n+" is divisible by 9.");
		else
			System.out.println("The number "+n+" is not divisible by 9.");
		sc.close();
	}
}