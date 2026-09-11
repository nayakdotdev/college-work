public class A2CLAQ6 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int mx=Math.max(a,Math.max(b,c));
		int mn=Math.min(a,Math.min(b,c));
		int md=(a+b+c)-(mx+mn);
		System.out.println("Ascending order: "+mn+" "+md+" "+mx);
	}
}