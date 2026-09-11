import java.util.Scanner;
public class A4Q12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base: ");
		int b=sc.nextInt();
		System.out.print("Enter the power: ");
		int p=sc.nextInt();
		int r=b;
		for(int i=1;i<p;i++) {
			r=r*b;
		}
		System.out.println(b+" to the power "+p+" is: "+r);
		sc.close();
	}
}