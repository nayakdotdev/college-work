// Given an array of size N. The elements in the array may be repeated. You need to
// find the sum of distinct elements of the array. If there is some value repeated then
// they should be added once.
// INPUT: A=[1, 2, 3, 1, 1, 4, 5, 6, 5] OUTPUT: Sum= 21

class Q4{
    void distinctSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(!found)
                sum+=arr[i];
        }
        System.out.println("Sum = "+sum);
    }
    void main(){
        Q4 ob=new Q4();
        int a[]={1,2,3,1,1,4,5,6,5};
        ob.distinctSum(a);
    }
}