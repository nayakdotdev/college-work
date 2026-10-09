/*
Merging two sorted arrays: Given two sorted arrays A with m numbers and B with
n numbers. Merge the elements of these two arrays so that first array A will have
first m numbers out of sorted m+n numbers and second array B will have last n
numbers out of sorted m+n numbers.
Input: A=[5, 7, 11, 19, 23] B=[6, 13, 20] Output: A=[5, 6, 7, 11, 13] B=[19, 20, 23]
*/

class Q5{
    void mergeArrays(int A[],int B[]){
        int m=A.length,n=B.length;
        int merged[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(A[i]<=B[j])
                merged[k++]=A[i++];
            else
                merged[k++]=B[j++];
        }
        while(i<m)
            merged[k++]=A[i++];
        while(j<n)
            merged[k++]=B[j++];
        for(i=0;i<m;i++)
            A[i]=merged[i];
        for(i=0;i<n;i++)
            B[i]=merged[m+i];
        System.out.print("A=[");
        for(i=0;i<m;i++){
            System.out.print(A[i]);
            if(i<m-1)
                System.out.print(", ");
        }
        System.out.println("]");
        System.out.print("B=[");
        for(i=0;i<n;i++){
            System.out.print(B[i]);
            if(i<n-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    void main(){
        Q5 ob=new Q5();
        int A[]={5,7,11,19,23};
        int B[]={6,13,20};
        ob.mergeArrays(A,B);
    }
}