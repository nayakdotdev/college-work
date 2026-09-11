import java.util.Scanner;
public class A2Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double d1=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
		double d2=Math.pow(d1,0.5);
		System.out.println("The distance between the two points is "+d2);
		sc.close();
	}
}