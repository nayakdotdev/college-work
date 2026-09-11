import java.util.Scanner;
public class A6Q11 {
	public static int count(String str, char a) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==a)
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.next();
		System.out.print("Enter a character: ");
		char c=sc.next().charAt(0);
		System.out.println("The number of occurrences of '"+c+"' in \""+s+"\" is "+count(s,c));
		sc.close();
	}
}