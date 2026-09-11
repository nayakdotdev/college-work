import java.util.Scanner;
public class A6Q14 {
	public static String toTitleCase(String str) {
		String r="";
		boolean StartOfWord=true;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(StartOfWord&&Character.isLetter(ch)) {
				r+=Character.toUpperCase(ch);
				StartOfWord=false;
			}
			else 
				r+=ch;
			if(ch==' ')
				StartOfWord=true;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("Converted string: "+toTitleCase(s));
		sc.close();
	}
}