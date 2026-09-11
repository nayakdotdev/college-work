import java.util.Scanner;
public class A4Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		String r=s.replace("0","");
		int x=Integer.parseInt(r);
		System.out.println("After removing 0 from number "+n+", the new number is "+x);
		sc.close();
	}
}