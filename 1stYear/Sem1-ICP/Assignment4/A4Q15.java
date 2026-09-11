public class A4Q15 {
	public static void main(String[] args) {
		int s1=0,s2=0;
		for(int i=1;i<=100;i++) {
			s1+=Math.pow(i,2);
			s2+=i;
		}
		int s3=(int)Math.pow(s2,2);
		System.out.println("Sum of squares of first 100 natural numbers = "+s1);
		System.out.println("Square of the sum of first 100 natural numbers = "+s3);
		System.out.println("Difference = "+(s3-s1));
	}
}