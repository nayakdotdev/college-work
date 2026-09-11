import java.util.Scanner;
public class A2Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of eggs: ");
		int e=sc.nextInt();
		int g=e/144;
		int d=(e-(144*g))/12;
		int l=(e-(144*g))-(12*d);
		System.out.println("Total number of eggs is "+g+" gross, "+d+" dozen, and "+l+".");
		sc.close();
	}
}