public class A2CLAQ9 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=0,x=n,ld;
		ld=x%10;
		s+=ld;
		x/=1000;
		ld=x%10;;
		s+=ld;
		System.out.println("Sum of the first and last digit of "+n+" is: "+s);
	}
}