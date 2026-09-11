import java.util.Scanner;
public class A2Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a side: ");
		double s=sc.nextDouble();
		double a=3*Math.sqrt(3)/2*Math.pow(s,2);
		System.out.println("The area of the hexagon is "+a);
		sc.close();
	}
}