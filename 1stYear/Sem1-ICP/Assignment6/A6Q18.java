import java.util.Scanner;
public class A6Q18 {
	public static double volume(int s) {
		return s*s*s;
	}
	public static double volume(int l,int b,int h) {
		return l*b*h;
	}
	public static double volume(double r) {
		return (4/3)*Math.PI*r*r*r;
	}
	public static double volume(double r, double h) {
		return Math.PI*r*r*h;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== VOLUME CALCULATOR (Method Overloading) ===\r\n"
				+ "1. Volume of Cube\r\n"
				+ "2. Volume of Rectangular Prism (Cuboid)\r\n"
				+ "3. Volume of Sphere\r\n"
				+ "4. Volume of Cylinder\r\n"
				+ "5. Exit");
		System.out.print("Enter your choice: ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter side: ");
			int s=sc.nextInt();
			System.out.println("Area of Cube: "+volume(s));
			break;
		case 2:
			System.out.print("Enter length, breadth, height: ");
			int l=sc.nextInt();
			int b=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("Area of Cuboid: "+volume(l,b,h));
			break;
		case 3:
			System.out.print("Enter radius: ");
			double r=sc.nextDouble();
			System.out.println("Area of Sphere: "+volume(r));
			break;
		case 4:
			System.out.print("Enter radius, height: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println("Area of Cylinder: "+volume(x,y));
			break;
		case 5:
			System.out.println("Program Terminated!");
			System.exit(0);
		}
		sc.close();
	}
}