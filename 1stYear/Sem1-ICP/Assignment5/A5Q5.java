import java.util.Scanner;
public class A5Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int s=0;
		for(int i=1;i<=n;i++) {
			int x=0;
			for(int j=1;j<=i;j++)
				x+=j;
			s+=x;
		}
		System.out.println("The sum of the series is: "+s);
		sc.close();
	}
}