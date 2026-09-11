import java.util.Scanner;
public class A6Q20 {
	public static int countSpaces(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("Number of spaces in the string: "+countSpaces(s));
		sc.close();
	}
}