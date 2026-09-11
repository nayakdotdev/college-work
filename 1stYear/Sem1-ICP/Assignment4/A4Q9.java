import java.util.Scanner;
public class A4Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		int x=n,s=0,d=0;
		while(x>0) {
			d=x%10;
			s+=d;
			x/=10;
		}
		if(n%s==0)
			System.out.println(n+" is a Niven Number.");
		else
			System.out.println(n+" is not a Niven Number.");
		sc.close();
	}
}