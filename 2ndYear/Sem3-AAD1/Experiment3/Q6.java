// Check reverse: Given an array of integers, find if reversing a sub-array makes the
// array sorted.
// Input: A= [1, 2, 6, 5, 4, 7]
// Output: True Explanation: Reversing sub array [6, 5, 4] the whole array gets sorted.

class Q6{
    boolean checkReverse(int arr[]){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<n-1&&arr[l]<=arr[l+1])
            l++;
        if(l==n-1)
            return true;
        while(r>0&&arr[r-1]<=arr[r])
            r--;
        if(l>=r)
            return false;
        int i=l,j=r;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    void main(){
        Q6 ob=new Q6();
        int a[]={1,2,6,5,4,7};
        System.out.println(ob.checkReverse(a));
    }
}