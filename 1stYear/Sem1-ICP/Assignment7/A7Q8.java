public class A7Q8 {
    public static void fillArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=2+(int)(Math.random()*(30-2+1));
    }
    public static void printArray(int[] arr){
        System.out.print("Array elements: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static boolean isPrime(int num){
        boolean check=true;
        for(int i=2;i<num;i++){
            if(num%i==0)
                check=false;
        }
        return check;
    }
    public static int countPrimes(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i]))
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        fillArray(a);
        printArray(a);
        System.out.println("Number of prime numbers in the array: "+countPrimes(a));
    }
}
