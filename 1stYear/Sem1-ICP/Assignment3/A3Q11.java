import java.util.Scanner;
public class A3Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		System.out.println("Is "+n+" divisible by 5 and 6? "+(n%5==0&&n%6==0));
		System.out.println("Is "+n+" divisible by 5 or 6? "+(n%5==0||n%6==0));
		System.out.println("Is "+n+" divisible by 5 or 6, but not both? 1"+(n%5==0^n%6==0));
		sc.close();
	}
}