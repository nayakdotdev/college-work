import java.util.Scanner;
public class A5Q3 {
	public static int fact(int n) {
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int s=0,x=n,d=0;
		while(x>0) {
			d=x%10;
			s+=fact(d);
		    x/=10;
		}
		if(n==s)
			System.out.println(n+" is Strong Number");
		else
			System.out.println(n+" is NOT Strong Number");
		sc.close();
	}
}