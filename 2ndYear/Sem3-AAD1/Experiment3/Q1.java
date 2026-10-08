// Implement Selection sort to sort a given list of integers in non-increasing order.

class Q1{
    void selectionSort(int a[],int lb,int ub){
        for(int i=lb;i<ub;i++){
            int s=i;
            for(int j=i+1;j<=ub;j++){
                if(a[j]>a[s])
                    s=j;
            }
            int t=a[i];
            a[i]=a[s];
            a[s]=t;
        }
    }
    void main(){
        Q1 ob=new Q1();
        int nums[]={43,12,53,33,56,64};
        System.out.println("Before Sort");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        System.out.println("After Sort");
        ob.selectionSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}