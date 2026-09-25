// - Write Recursive program to perform Binary search over a list of integers. The
// List may be sorted in ascending or descending order. Say the given ITEM is
// found or not.
// - Write Recursive program to perform Linear search over a list of integers. Say
// the given ITEM is found or not.

class Q2{
    boolean binarySearch(int a[],int l,int h,int k){
        if(l>h)
            return false;
        int m=(l+h)/2;
        if(a[m]==k)
            return true;
        boolean isAsc=a[l]<=a[h];
        if(isAsc){
            if(a[m]<k)
                return binarySearch(a,m+1,h,k);
            else
                return binarySearch(a,l,m-1,k);
        }
        else{
            if(a[m]<k)
                return binarySearch(a,l,m-1,k);
            else
                return binarySearch(a,m+1,h,k);
        }
    }
    boolean linearSearch(int a[],int lb,int ub,int k){
        if(lb>ub)
            return false;
        if(a[lb]==k)
            return true;
        return linearSearch(a, lb+1, ub, k);
    }
    void main(){
        int a[]={2,5,8,12,16,23,38,56,72,91};
        int b[]={91,72,56,38,23,16,12,8,5,2};
        System.out.println("Target Found: "+binarySearch(a, 0, a.length-1, 23));
        System.out.println("Target Found: "+binarySearch(b, 0, b.length-1, 12));
        int c[]={10,23,45,70,11,15,90,32};
        System.out.println("Target Found: "+linearSearch(c, 2, 6, 15));
    }
}