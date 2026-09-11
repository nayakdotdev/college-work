public class A5Q8 {
	public static void main(String[] args) {
		System.out.println("Design Pattern 1:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("$ ");
			System.out.println();
		}
		System.out.println("Design Pattern 2:");
		for(int i=1;i<=5;i++) {
			for(int k=5;k>i;k--)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("$ ");
			System.out.println();
		}
		System.out.println("Design Pattern 3:");
		for(int i=1;i<=5;i++) {
			for(int k=5;k>=i;k--)
				System.out.print("$ ");
			System.out.println();
		}
		System.out.println("Design Pattern 4:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int k=5;k>=i;k--)
				System.out.print("$ ");
			System.out.println();
		}
	}
}