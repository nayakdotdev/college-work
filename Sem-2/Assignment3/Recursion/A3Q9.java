import java.util.Scanner;
public class A3Q9 {
    public static void reverse(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            reverse(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Reverse of "+n+":");
        reverse(n);
        sc.close();
    }
}