// Rotate an array by K Positions: Give an array rotate its elements by k positions.
// Example: If [1,2,3,4,5,6] gets rotated by 2 positions then the array [3,4,5,6,1,2].

class Q7{
    void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        for(int j=0;j<k;j++){
            int first=arr[0];

            for(int i=0;i<n-1;i++)
                arr[i]=arr[i+1];

            arr[n-1]=first;
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1)
                System.out.print(",");
        }
        System.out.println("]");
    }
    void main(){
        Q7 ob=new Q7();
        int a[]={1,2,3,4,5,6};
        ob.rotate(a,2);
    }
}