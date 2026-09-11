import java.util.Scanner;
public class A4Q14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n=sc.nextInt();
		int s=0,p=1;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				s+=i;
			else
				p*=i;
		}
		System.out.println("Sum of all even numbers="+s);
		System.out.println("Product of all odd numbers="+p);
		sc.close();
	}
}