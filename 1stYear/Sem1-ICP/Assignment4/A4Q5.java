import java.util.Scanner;
public class A4Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x=sc.nextInt();
		System.out.print("Enter second number: ");
		int y=sc.nextInt();
		System.out.print("Enter third number: ");
		int z=sc.nextInt();
		int s=0;
		for(int i=x;i<=y;i+=z) {
			System.out.print(i+" ");
			s+=i;
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+s);
		sc.close();
	}
}