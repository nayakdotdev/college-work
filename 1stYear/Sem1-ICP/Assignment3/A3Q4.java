import java.util.Scanner;
public class A3Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter user number: ");
		int x=sc.nextInt();
		int y=1+(int)(Math.random()*9);
		System.out.println("Computer Guesses: "+y);
		if(x==y)
			System.out.println("You got it right");
		else if(x==(--y)||x==(++y))
			System.out.println("Almost got it");
		else
			System.out.println("You got it wrong");
		sc.close();
	}
}