import java.util.Scanner;
public class A4Q13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range(R): ");
		int r=sc.nextInt();
		int s=0;
		for(int i=2;i<r;i++) {
			if(i%3==0||i%5==0)
				s+=i;
		}
		System.out.println("The sum of all multiples of 3 or 5 below 10 is: "+s);
		sc.close();
	}
}