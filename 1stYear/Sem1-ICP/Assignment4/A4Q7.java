import java.util.Scanner;
public class A4Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Using for loop (1 to 3):");
		for(int i=1;i<=3;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
		System.out.println("Using while loop (4 to 6):");
		int i=4;
		while(i<=6) {
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		}
		System.out.println("Using do-while loop (7 to 10):");
		i=7;
		do {
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		} while(i<=10);
		sc.close();
	}
}