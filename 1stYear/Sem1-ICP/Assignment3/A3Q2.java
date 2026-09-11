import java.util.Scanner;
public class A3Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of steps walked:");
		int n=sc.nextInt();
		if(n>=10000)
			System.out.println("Good job! You are active today");
		else
			System.out.println("You need to walk more for good health");
		sc.close();
	}
}