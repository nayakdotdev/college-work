import java.util.Scanner;
public class A3Q6 {
    public static <T> int count(T[] array,T item){
        int c=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==item)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Creating a Integer Array:");
        Integer a[]=new Integer[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter element: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to count occurence: ");
        Integer n=sc.nextInt();
        System.out.println(n+" occurs "+count(a,n)+" times(s)");
        System.out.println("Creating a Integer Array:");
        Double b[]=new Double[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter element: ");
            b[i]=sc.nextDouble();
        }
        System.out.print("Enter element to count occurence: ");
        Double m=sc.nextDouble();
        System.out.println(m+" occurs "+count(b,m)+" times(s)");
        sc.close();
    }
}