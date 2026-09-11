import java.util.Scanner;
public class A6Q12 {
	public static int countVowels(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("The number of vowels in \""+s+"\" is "+countVowels(s));
		sc.close();
	}
}