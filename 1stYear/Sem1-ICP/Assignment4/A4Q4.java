import java.util.Scanner;
public class A4Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number between 1 and 10!");
		int g, r=1+(int)(Math.random()*10);
		do {
			System.out.print("Enter your guess: ");
			g=sc.nextInt();
			if(g==r)
				System.out.println("Good Guess!");
			else if(g>r)
				System.out.println("Too high, try again.");
			else if(g<r)
				System.out.println("Too low, try again.");
		} while(g!=r);
		sc.close();
	}
}