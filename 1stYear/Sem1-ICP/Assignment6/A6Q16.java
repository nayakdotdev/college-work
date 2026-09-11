import java.util.Scanner;
public class A6Q16 {
	public static boolean isValidPassword(String password) {
		int c=0;
		if(password.length()<8)
			return false;
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if(!Character.isLetterOrDigit(ch))
				return false;
			if(Character.isDigit(ch))
				c++;
		}
		if(c<2)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Password: ");
		String s=sc.next();
		if(isValidPassword(s)==true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		sc.close();
	}
}