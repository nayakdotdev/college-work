import java.util.Scanner;
public class A5Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int s1=1,s2=1;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				s1+=i;
		}
		for(int i=2;i<=y/2;i++) {
			if(y%i==0)
				s2+=i;
		}
		if(x==s2 && y==s1)
			System.out.println(x+" and "+y+" are Amicable.");
		else
			System.out.println(x+" and "+y+" are NOT Amicable.");
		sc.close();
	}
}