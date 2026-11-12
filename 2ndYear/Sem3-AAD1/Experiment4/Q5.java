// Given an array of positive and negative integers, find the contiguous subarray whose
// sum is the maximum.
// INPUT: {1,2,-3,4,5,-10,6,7} OUTPUT: 13

class Q5{
    void maxSubarraySum(int arr[]){
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(max,sum);
        }
        System.out.println("Maximum Sum: "+max);
    }
    void main(){
        Q5 ob=new Q5();
        int a[]={1,2,-3,4,5,-10,6,7};
        ob.maxSubarraySum(a);
    }
}