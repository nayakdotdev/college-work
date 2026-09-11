import java.util.Scanner;
public class A5Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		int d=0,rev=0,x=n;
		boolean p1=true,p2=true;
		while(x>0) {
			d=x%10;
			rev=rev*10+d;
			x/=10;
		}
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				p1=false;
				break;
			}
		}
		for(int i=2;i<=(int)Math.sqrt(rev);i++) {
			if(n%i==0) {
				p2=false;
				break;
			}
		}
		if(p1&&p2)
			System.out.println(n+" is Twisted Prime.");
		else
			System.out.println(n+" is NOT Twisted Prime.");
		sc.close();
	}
}