public class A2CLAQ1 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Evenly Divides "+a+" "+b+" ---> "+(a%b==0||b%a==0));
	}
}