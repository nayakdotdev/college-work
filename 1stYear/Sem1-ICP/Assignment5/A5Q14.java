import java.util.Scanner;
public class A5Q14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x=sc.nextDouble();
        double term=1.0;
        double sum=term;
        int n=1;
        while(Math.abs(term)>1e-6){
            term=-term*x*x/((2*n-1)*(2*n));
            sum+=term;
            n++;
        }
        System.out.println("cos(" +x+ ") = "+sum);
		sc.close();
    }
}