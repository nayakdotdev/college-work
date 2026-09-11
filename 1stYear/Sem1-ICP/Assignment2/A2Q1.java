import java.util.Scanner;
public class A2Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double t=sc.nextDouble();
		double f=(9.0/5)*t+32;
		System.out.println(t+" Celsius is "+f+" Fahrenheit");
		sc.close();
	}
}