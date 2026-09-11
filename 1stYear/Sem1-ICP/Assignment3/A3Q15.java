import java.util.Scanner;
public class A3Q15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int u=sc.nextInt();
		int c=(int)(Math.random()*3);
		if(c==0&&u==1)
			System.out.println("The computer is "+c+". You are "+u+". You won");
		else if(c==2&&u==0)
			System.out.println("The computer is "+c+". You are "+u+". You won");
		else if(c==1&&u==2)
			System.out.println("The computer is "+c+". You are "+u+". You won");
		else if(u==0&&c==1)
			System.out.println("The computer is "+c+". You are "+u+". You lose");
		else if(u==2&&c==0)
			System.out.println("The computer is "+c+". You are "+u+". You lose");
		else if(u==1&&c==2)
			System.out.println("The computer is "+c+". You are "+u+". You lose");
		else if(u==c)
			System.out.println("The computer is "+c+". You are "+u+" too. It is a draw.");
		else
			System.out.println("enter a valid input for the game.");
		sc.close();
	}
}