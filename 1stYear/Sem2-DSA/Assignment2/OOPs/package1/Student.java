package package1;
import java.util.Scanner;
public class Student {
    String name;
    int roll;
    public void inputDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter roll: ");
        roll=sc.nextInt();
    }
    public void showDetails(){
        System.out.println("Name is "+name);
        System.out.println("Roll no is "+roll);
    }
}