import java.util.Scanner;
public class A6Q15 {
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		if(isPalindrome(s)==true)
			System.out.println(s+" is a palindrome.");
		else
			System.out.println(s+" is a NOT palindrome.");
		sc.close();
	}
}