// Given an array, find if there is a pair whose sum is equal to the sum of the rest of the
// elements of the array. {Input: 4, 8, 1, 2, 16, 15 Output: 8, 15}

class Q5{
    void findPair(int arr[]){
        int sum=0;
        for(int x:arr)
            sum+=x;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum-(arr[i]+arr[j])){
                    System.out.println(arr[i]+", "+arr[j]);
                    return;
                }
            }
        }
        System.out.println("No Pair Found");
    }
    void main(){
        Q5 ob=new Q5();
        int a[]={4,8,1,2,16,15};
        ob.findPair(a);
    }
}