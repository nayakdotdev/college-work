import java.util.*;
public class A6Q6 {
	public static int sumOfDivisors(int n) {
		int s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				s+=i;
		}
		return s;
	}
	public static Boolean isFriendlyPair(int a, int b) {
		if((sumOfDivisors(a)/a)==(sumOfDivisors(b)/b))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int x=sc.nextInt();
		System.out.print("Enter second number: ");
		int y=sc.nextInt();
		System.out.println("Sum of proper divisors of "+x+" = "+sumOfDivisors(x));
		System.out.println("Sum of proper divisors of "+y+" = "+sumOfDivisors(y));
		if(isFriendlyPair(x,y)==true)
			System.out.println(x+" and "+y+" are a Friendly Pair.");
		else
			System.out.println(x+" and "+y+" are a NOT Friendly Pair.");
	}
}