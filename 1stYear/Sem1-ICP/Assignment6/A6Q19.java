import java.util.Scanner;
public class A6Q19 {
	public static boolean consecutiveNumber(int x,int y,int z) {
		int a=x+1,b=x+2;
		if(y==a&&z==b)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(consecutiveNumber(0,17,18));
		sc.close();
	}
}