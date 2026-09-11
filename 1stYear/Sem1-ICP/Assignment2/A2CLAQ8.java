public class A2CLAQ8 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		System.out.println("Product Check "+a+" "+b+" "+c+" -> "+((a<=(b*c))||(b<=(a*c))||(c<=(a*b))));
	}
}