import java.util.*;
public class A7Q4 {
    public static double min(double[] array){
        double mn=Double.MAX_VALUE;
        for(int i=0;i<array.length;i++)
            mn=Math.min(mn,array[i]);
        return mn;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i=0;i<10;i++)
            a[i]=sc.nextDouble();
        System.out.println("The minimum number is: "+min(a));
        sc.close();
    }
}
