public class A7Q13 {
    public static void fillArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=50+(int)(Math.random()*((100-50)+1));
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        fillArray(a);
        System.out.println("Original Array:");
        printArray(a);
        reverseArray(a);
        System.out.println("Reversed Array:");
        printArray(a);
    }
}