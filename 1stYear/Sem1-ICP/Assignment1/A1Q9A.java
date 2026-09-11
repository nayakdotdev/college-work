public class A1Q9A {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d;
		System.out.println("Before interchange A="+a+", B="+b+", C="+c);
		d=a;
		a=b;
		b=c;
		c=d;
		System.out.println("After interchange A="+a+", B="+b+", C="+c);
	}
}