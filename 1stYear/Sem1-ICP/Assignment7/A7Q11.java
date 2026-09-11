import java.util.*;
public class A7Q11 {
    public static double max(double[] array){
        double mx=Double.MIN_VALUE;
        for(int i=0;i<array.length;i++)
            mx=Math.max(mx,array[i]);
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextDouble();
        System.out.println("The maximum number is: "+max(a));
        sc.close();
    }
}
