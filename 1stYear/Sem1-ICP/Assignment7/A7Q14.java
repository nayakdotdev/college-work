import java.util.*;
public class A7Q14 {
    public static String decimalToOctal(int decimal){
        String o="";
        while(decimal>0){
            int r=decimal%8;
            o=r+o;
            decimal/=8;
        }
        return o;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n=sc.nextInt();
        System.out.println("Octal representation: "+decimalToOctal(n));
        sc.close();
    }
}
