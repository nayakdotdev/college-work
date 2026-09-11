import java.util.Scanner;
public class A5Q13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x (in radians): ");
        double x=sc.nextDouble();
        double term=x;
        double sum=term;
        int n=1;
        while(Math.abs(term)>1e-6){
            term=-term*x*x/((2*n)*(2*n+1));
            sum+=term;
            n++;
        }
        System.out.println("sin("+x+") = "+sum);
		sc.close();
    }
}