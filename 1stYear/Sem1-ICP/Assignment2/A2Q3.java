import java.util.Scanner;
public class A2Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		double bs=sc.nextDouble();
		double da=(40*bs)/100;
		double hra=(20*bs)/100;
		double gs=bs+da+hra;
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross salary is "+(int)gs);
		sc.close();
	}
}