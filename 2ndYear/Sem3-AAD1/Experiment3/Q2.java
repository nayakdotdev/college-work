// Implement Insertion sort to sort a given list of integers in non-increasing order. 

class Q2{
    void insertionSort(int a[],int lb,int ub){
        for(int i=lb+1;i<=ub;i++){
            int temp=a[i],j;
            for(j=i-1;j>=lb&&a[j]<temp;j--)
                a[j+1]=a[j];
            a[j+1]=temp;
        }
    }
    void main(){
        Q2 ob=new Q2();
        int nums[]={43,12,53,33,56,64};
        System.out.println("Before Sort");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        System.out.println("After Sort");
        ob.insertionSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}