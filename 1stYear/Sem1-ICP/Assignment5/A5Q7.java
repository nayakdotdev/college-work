public class A5Q7 {
	public static void main(String[] args) {
		System.out.println("Design Pattern 1:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("Design Pattern 2:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("Design Pattern 3:");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		System.out.println("Design Pattern 4:");
		for(int i=65;i<=69;i++) {
			for(int j=65;j<=i;j++)
				System.out.print((char)j+" ");
			System.out.println();
		}
	}
}