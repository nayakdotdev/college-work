// Given an array of n distinct positive integers, find is there a subset of size 3 whose
// sum is equal to a given value K.
// Say if the array is [3, 4, 8, 1, 2, 16, 15, 7, 11]
// CASE-1 :K= 18 Output: YES
// CASE-2: K=36 Output: NO

class Q4{
    boolean findTriplet(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int l=j+1;l<n;l++){
                    if(arr[i]+arr[j]+arr[l]==k)
                        return true;
                }
            }
        }
        return false;
    }
    void main(){
        Q4 ob=new Q4();
        int a[]={3,4,8,1,2,16,15,7,11};

        System.out.println(ob.findTriplet(a,18)?"YES":"NO");
        System.out.println(ob.findTriplet(a,36)?"YES":"NO");
    }
}