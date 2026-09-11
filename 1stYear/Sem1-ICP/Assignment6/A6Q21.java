import java.util.Scanner;
public class A6Q21 {
	public static void countCharacters(String str) {
		int c1=0,c2=0,c3=0,c4=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				c1++;
			else if(Character.isLowerCase(ch))
				c2++;
			else if(Character.isDigit(ch))
				c3++;
			else
				c4++;
		}
		System.out.println("Uppercase letters: "+c1);
		System.out.println("Lowercase letters: "+c2);
		System.out.println("Digits: "+c3);
		System.out.println("Special characters: "+c4);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		countCharacters(s);
		sc.close();
	}
}