public class A6Q7 {
	public static int numberOfDaysInAYear(int y) {
		if(y%100==0){
			if(y%400==0)
				return 366;
			else
				return 365;
		}
		else {
			if(y%4==0)
				return 366;
			else
				return 365;
		}
	}
	public static void main(String[] args) {
		System.out.println("Year\tDays");
		for(int i=2000;i<=2020;i++) {
			System.out.println(i+"\t"+numberOfDaysInAYear(i));
		}
	}
}