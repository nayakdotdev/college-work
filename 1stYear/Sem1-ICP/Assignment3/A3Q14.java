public class A3Q14 {
	public static void main(String[] args) {
		int r=1+(int)(Math.random()*12);
		System.out.println("Randomly generated number: "+r);
		if(r==1)
			System.out.println("Corresponding month: January");
		else if(r==2)
			System.out.println("Corresponding month: February");
		else if(r==3)
			System.out.println("Corresponding month: March");
		else if(r==4)
			System.out.println("Corresponding month: April");
		else if(r==5)
			System.out.println("Corresponding month: May");
		else if(r==6)
			System.out.println("Corresponding month: June");
		else if(r==7)
			System.out.println("Corresponding month: July");
		else if(r==8)
			System.out.println("Corresponding month: August");
		else if(r==9)
			System.out.println("Corresponding month: September");
		else if(r==10)
			System.out.println("Corresponding month: October");
		else if(r==11)
			System.out.println("Corresponding month: November");
		else
			System.out.println("Corresponding month: December");
	}
}