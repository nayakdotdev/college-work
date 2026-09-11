public class A6Q2 {
	public static int countDigits(int n) {
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	public static int power(int a, int b) {
		return (int)Math.pow(a,b);
	}
	public static boolean isArmstrong(int n) {
		int x=n,s=0;
		while(x>0) {
			int d=x%10;
			s+=power(d,countDigits(n));
			x/=10;
		}
		if(s==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int c=0;
		System.out.println("Armstrong Numbers from 100 to 10000:");
		for(int i=100;i<=10000;i++) {
			if(isArmstrong(i)==true) {
				System.out.println(i);
				c++;
			}
		}
		System.out.println("Total Armstrong Numbers Found: "+c);
	}
}