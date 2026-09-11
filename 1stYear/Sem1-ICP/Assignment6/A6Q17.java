import java.util.Scanner;
public class A6Q17 {
	public static void middleChar(String s) {
		int m=s.length()/2;
		for(int i=0;i<s.length();i++) {
			if(i==m)
				System.out.println("The middle character in the string: "+s.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		middleChar("JAVA");
		sc.close();
	}
}