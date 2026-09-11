import java.util.Scanner;
public class A6Q10 {
	public static int area(int s) {
		return s*s;
	}
	public static int area(int l,int b) {
		return l*b;
	}
	public static double area(double r) {
		return Math.PI*r*r;
	}
	public static double area(double x,double y,double z) {
		double s=(x+y+z)/2;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== AREA CALCULATOR (Method Overloading) ===\r\n"
				+ "1. Area of Square\r\n"
				+ "2. Area of Rectangle\r\n"
				+ "3. Area of Circle\r\n"
				+ "4. Area of Triangle\r\n"
				+ "5. Exit");
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter side: ");
			int s=sc.nextInt();
			System.out.println("Area of Square="+area(s));
			break;
		case 2:
			System.out.print("Enter length: ");
			int l=sc.nextInt();
			System.out.print("Enter breadth: ");
			int b=sc.nextInt();
			System.out.println("Area of Rectangle="+area(l,b));
			break;
		case 3:
			System.out.print("Enter radius: ");
			double r=sc.nextDouble();
			System.out.println("Area of Circle="+area(r));
			break;
		case 4:
			System.out.print("Enter sides of Triangle: ");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			double z=sc.nextDouble();
			System.out.println("Area of Triangle="+area(x,y,z));
			break;
		case 5:
			System.out.println("Program Terminated!");
			System.exit(0);
		}
		sc.close();
	}
}