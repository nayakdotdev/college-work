// Find the missing number in an array Problem: In a given list of n-1 elements,
// which are in the range of 1 to n. There are no duplicates in the array. One of the
// integers is missing. Find the missing element.

class Q1{
    int missingNumber(int arr[],int n){
        int sum=n*(n+1)/2;
        int s=0;
        for(int x:arr)
            s+=x;
        return sum-s;
    }
    void main(){
        Q1 ob=new Q1();
        int a[]={1,2,4,5,6};
        System.out.println("Missing Number: "+ob.missingNumber(a,6));
    }
}