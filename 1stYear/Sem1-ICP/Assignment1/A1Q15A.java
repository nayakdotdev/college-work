public class A1Q15A {
	public static void main(String[] args) {
		int W=10,G=20,K=30,A=40,temp;
		System.out.println("Before Interchanging W="+W+", G="+G+", K="+K+", A="+A);
		temp=W;
		W=G;
		G=K;
		K=A;
		A=temp;
		System.out.println("After Interchanging W="+W+", G="+G+", K="+K+", A="+A);
	}
}