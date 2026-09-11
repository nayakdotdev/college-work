package package1;
import java.util.Scanner;
public class Test extends Student{
    public int mark1,mark2;
    public void inputDetails(){
        Scanner sc=new Scanner(System.in);
        super.inputDetails();
        System.out.print("Enter Mark1: ");
        mark1=sc.nextInt();
        System.out.print("Enter Mark2: ");
        mark2=sc.nextInt();
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("Mark1 is "+mark1);
        System.out.println("Mark2 is "+mark2);
    }
}