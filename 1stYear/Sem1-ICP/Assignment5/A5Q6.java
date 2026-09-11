import java.util.Scanner;
public class A5Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		double s=0;
		for(int i=1;i<=n;i++) {
			s+=1/Math.pow(i,2);
		}
		System.out.println("Sum="+s);
		sc.close();
	}
}