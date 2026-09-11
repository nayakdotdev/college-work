import java.util.Scanner;
public class A3Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tot=0,dis=0;
		System.out.print("Enter the number of units consumed: ");
		int u=sc.nextInt();
		if(u<=50)
			tot=u*3.0;
		else if(u>=51&&u<=200)
			tot=((u-50)*4.8)+(50*3.0);
		else if(u>=201&&u<=400)
			tot=((u-200)*5.8)+(150*4.8)+(50*3.0);
		else if(u>=401)
			tot=((u-400)*6.2)+(200*5.8)+(150*4.8)+(50*3.0);
		System.out.print("Do you want to pay your bill online? (Y/N): ");
		char ch=sc.next().charAt(0);
		if(ch=='Y') {
			dis=0.03*tot;
			System.out.println("You received a 3% online payment discount of Rs. "+dis);
			System.out.println("Total Electricity Bill: Rs. "+tot);
			System.out.println("Amount Payable: Rs. "+(tot-dis));
		}
		else {
			System.out.println("Total Electricity Bill: Rs. "+tot);
			System.out.println("Amount Payable: Rs. "+(tot-dis));
		}
		sc.close();
	}
}