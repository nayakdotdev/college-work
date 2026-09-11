import java.util.Scanner;
public class A3Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first side: ");
		int x=sc.nextInt();
		System.out.print("Enter second side: ");
		int y=sc.nextInt();
		System.out.print("Enter third side: ");
		int z=sc.nextInt();
		if((x+y)>z) {
			if(x==y&&y==z&&x==z)
				System.out.println("The triangle is Equilateral.");
			else if(x==y||y==z||x==z)
				System.out.println("The triangle is Isosceles.");
			else
				System.out.println("The triangle is Scalene.");
		}
		else
			System.out.println("The given sides do not form a valid triangle.");
		sc.close();
	}
}