import java.util.Scanner;
public class A3Q13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x-y coordinates of the point:");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		if(x>0&&y>0)
			System.out.println("("+x+","+y+") is in Quadrant I");
		else if(x<0&&y<0)
			System.out.println("("+x+","+y+") is in Quadrant III");
		else if(x>0&&y<0)
			System.out.println("("+x+","+y+") is in Quadrant IV");
		else if(x<0&&y>0)
			System.out.println("("+x+","+y+") is in Quadrant II");
		else if(x==0&&(y>0||y<0))
			System.out.println("("+x+","+y+") is on Y-Axis");
		else if(y==0&&(x>0||x<0))
			System.out.println("("+x+","+y+") is on X-Axis");
		else
			System.out.println("("+x+","+y+") is on Origin");
		sc.close();
	}
}