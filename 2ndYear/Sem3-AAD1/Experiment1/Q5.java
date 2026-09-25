// Binary search

class Q5{
    int binarySearch(int arr[],int lb,int ub,int k){
        boolean asc=arr[lb]<arr[ub];
        while(lb<=ub){
            int m=(lb+ub)/2;
            if(arr[m]==k)
                return m;
            if(asc){
                if(arr[m]<k)
                    lb=m+1;
                else
                    ub=m-1;
            }
            else{
                if(arr[m]<k)
                    ub=m-1;
                else
                    lb=m+1;
            }
        }
        return -1;
    }
    void main(){
        Q5 ob=new Q5();
        int nums1[]={1,2,3,4,5,6,7},nums2[]={7,6,5,4,3,2,1};
        System.out.println(ob.binarySearch(nums1, 1, 4, 3));
        System.out.println(ob.binarySearch(nums2, 2, 6, 4));
    }
}