// Linear search

class Q4{
    int linearSearch(int arr[],int lb,int ub,int k){
        for(int i=lb;i<=ub;i++){
            if(arr[i]==k)
                return i;
        }
        return -1;
    }
    void main(){
        Q4 ob=new Q4();
        int nums[]={43,12,53,33,56,64};
        System.out.println(ob.linearSearch(nums, 1, 4, 33));
    }
} 