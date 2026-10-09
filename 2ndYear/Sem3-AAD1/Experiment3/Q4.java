/*
Array reduction Problem: Given an array of positive elements. You need to
perform reduction operation. In each reduction operation smallest positive element
value is picked and all the elements are subtracted by that value. You need to print
the number of non-zero elements left after each reduction process.
Input: [5, 1, 1, 1, 2, 3, 5]
Output: After Iteration 1 : 4 corresponds to [4, 1, 2, 4] after subtraction
After Iteration 2 :3 corresponds to [3, 1, 3] after subtraction
After Iteration 3 :2 corresponds to [2, 2] after subtraction
After Iteration 4 :0 corresponds to [0] after subtraction
 */

class Q4{
    void arrayReduce(int arr[]){
        int it=1;
        while(true){
            int mn=Integer.MAX_VALUE;
            for(int x:arr){
                if(x>0)
                    mn=Math.min(mn,x);
            }
            if(mn==Integer.MAX_VALUE)
                break;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0)
                    arr[i]-=mn;
            }
            int c=0;
            for(int x:arr){
                if(x>0)
                    c++;
            }
            System.out.println("After Iteration "+it+":"+c);
            it++;
        }
    }
    void main(){
        Q4 ob=new Q4();
        int a[]={5,1,1,1,2,3,5};
        ob.arrayReduce(a);
    }
}