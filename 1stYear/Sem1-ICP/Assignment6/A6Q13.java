import java.util.Scanner;
public class A6Q13 {
	public static int countWords(String str) {
		int c=0;
		boolean inword=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				if(!inword) {
					c++;
					inword=true;
				}
			}
			else
				inword=false;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s=sc.nextLine();
		System.out.println("The number of words in the sentence is "+countWords(s));
		sc.close();
	}
}