public class A5Q10 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				if(j==i)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}