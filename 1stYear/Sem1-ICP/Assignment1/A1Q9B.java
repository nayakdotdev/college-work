public class A1Q9B {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("Before interchange A="+a+", B="+b+", C="+c);
		a=a+b+c;
		c=a-b-c;
		b=a-b-c;
		a=a-b-c;
		System.out.println("After interchange A="+a+", B="+b+", C="+c);
	}
}