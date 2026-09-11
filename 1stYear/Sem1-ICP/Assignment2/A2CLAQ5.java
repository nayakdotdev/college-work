public class A2CLAQ5 {
	public static void main(String[] args) {
		float x=Float.parseFloat(args[0]);
		float y=Float.parseFloat(args[1]);
		float z=Float.parseFloat(args[2]);
		if(x<y) {
			if(y<z)
				System.out.println("Strict Order Check "+x+" "+y+" "+z+" ---> "+true);
		}
		else if(x>y) {
			if(y>z)
				System.out.println("Strict Order Check "+x+" "+y+" "+z+" ---> "+true);
		}
		else
			System.out.println("Strict Order Check "+x+" "+y+" "+z+" ---> "+false);
	}
}