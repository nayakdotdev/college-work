import java.util.Scanner;
public class A2Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double r=sc.nextDouble();
		double l=sc.nextDouble();
		double a=Math.PI*r*r;
		double v=a*l;
		System.out.println("The area is "+a);
		System.out.println("The volume is "+v);
		sc.close();
	}
}