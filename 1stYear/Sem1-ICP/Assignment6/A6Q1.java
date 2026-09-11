import java.util.*;
public class A6Q1 {
	public static int additionSimple(int x,int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		if(x==0)
			System.out.println("Error! Division by zero is not allowed.");
		return y/x;
	}
	public static int remainderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		if(n<0)
			System.out.println("Error! Square root of a negative number is not allowed.");
		return Math.sqrt(n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("----- SIMPLE CALCULATOR -----\r\n"
				+ "1. Addition\r\n"
				+ "2. Subtraction\r\n"
				+ "3. Multiplication\r\n"
				+ "4. Division\r\n"
				+ "5. Remainder\r\n"
				+ "6. Square Root\r\n"
				+ "7. Exit");
		System.out.print("Choose an option: ");
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.print("Enter first number (x): ");
			int x=sc.nextInt();
			System.out.print("Enter second number (y): ");
			int y=sc.nextInt();
			System.out.println("Result (x+y) = "+additionSimple(x,y));
			break;
		case 2:
			System.out.print("Enter first number (x): ");
			int a=sc.nextInt();
			System.out.print("Enter second number (y): ");
			int b=sc.nextInt();
			System.out.println("Result (y-x) = "+subtractionSimple(a,b));
			break;
		case 3:
			System.out.print("Enter first number (x): ");
			int n=sc.nextInt();
			System.out.print("Enter second number (y): ");
			int m=sc.nextInt();
			System.out.println("Result (x*y) = "+multiplicationSimple(n,m));
			break;
		case 4:
			System.out.print("Enter first number (x): ");
			int o=sc.nextInt();
			System.out.print("Enter second number (y): ");
			int p=sc.nextInt();
			System.out.println("Result (y/x) = "+divisionSimple(o,p));
			break;
		case 5:
			System.out.print("Enter first number (x): ");
			int c=sc.nextInt();
			System.out.print("Enter second number (y): ");
			int d=sc.nextInt();
			System.out.println("Result (n%m) = "+remainderSimple(c,d));
			break;
		case 6:
			System.out.print("Enter number for square root: ");
			int e=sc.nextInt();
			System.out.println("Result = "+squareRootSimple(e));
			break;
		case 7:
			System.out.println("Exiting... Thank you!");
			System.exit(0);
		}
		sc.close();
		sc.close();
	}
}