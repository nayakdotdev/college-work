import java.util.Scanner;
public class A6Q9 {
	public static int reverse(int number) {
		int rev=0;
		while(number>0) {
			int d=number%10;
			rev=rev*10+d;
			number/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int number) {
		if(number==reverse(number))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n=sc.nextInt();
		if(isPalindrome(n)==true)
			System.out.println(n+" is a palindrome.");
		else
			System.out.println(n+" is NOT a palindrome.");
		sc.close();
	}
}