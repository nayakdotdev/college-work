import java.util.Scanner;
public class A2Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three points for a triangle:");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		double d1=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
		double d2=Math.sqrt(d1);
		double d3=Math.pow(x3-x2,2)+Math.pow(y3-y2,2);
		double d4=Math.sqrt(d3);
		double d5=Math.pow(x1-x3,2)+Math.pow(y1-y3,2);
		double d6=Math.sqrt(d5);
		double s=(d2+d4+d6)/2;
		double a=Math.sqrt(s*(s-d2)*(s-d4)*(s-d6));
		System.out.println("The area of the triangle is "+a);
		sc.close();
	}
}