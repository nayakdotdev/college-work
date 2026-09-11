import java.util.Scanner;
public class A3Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks=sc.nextInt();
		if(marks>100)
			System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
		else {
			switch(marks/10) {
			case 10:
			case 9:
				System.out.println("Grade: O");
				break;
			case 8:
				System.out.println("Grade: A");
				break;
			case 7:
				System.out.println("Grade: B");
				break;
			case 6:
				System.out.println("Grade: C");
				break;
			case 5:
				System.out.println("Grade: D");
				break;
			case 4:
				System.out.println("Grade: E");
				break;
			default:
				System.out.println("Grade: F");
			}
		}
		sc.close();
	}
}