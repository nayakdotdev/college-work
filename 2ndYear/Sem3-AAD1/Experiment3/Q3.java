// Implement Bubble sort to sort a given list of integers in non-increasing order.

class Q3{
    void bubbleSort(int a[],int lb,int ub){
        for(int i=lb;i<=ub;i++){
            for(int j=0;j<=ub-i-1;j++){
                if(a[j]<a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    void main(){
        Q3 ob=new Q3();
        int nums[]={43,12,53,33,56,64};
        System.out.println("Before Sort");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        System.out.println("After Sort");
        ob.bubbleSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}