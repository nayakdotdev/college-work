// Given an array of integers, find the element pair with minimum difference and
// maximum difference.

import java.util.Arrays;
class Q2{
    void findDifference(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        int min=arr[1]-arr[0];
        int max=arr[n-1]-arr[0];
        int a=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]<min){
                min=arr[i+1]-arr[i];
                a=i;
            }
        }
        System.out.println("Minimum Difference Pair: "+arr[a]+","+arr[a+1]);
        System.out.println("Minimum Difference: "+min);
        System.out.println("Maximum Difference Pair: "+arr[0]+","+arr[n-1]);
        System.out.println("Maximum Difference: "+max);
    }
    void main(){
        Q2 ob=new Q2();
        int a[]={2,5,8,12,20};
        ob.findDifference(a);
    }
}