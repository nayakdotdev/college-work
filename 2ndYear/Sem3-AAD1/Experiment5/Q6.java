// Given an array of positive integers representing the edges of a triangle. Find the
// number of triangles that can be formed from these elements, representing the sides of
// a triangle. For a triangle, the sum of two edges is always greater than the third edge.
// Input: 1, 2, 3, 4, 5 Output: 3

class Q6{
    int countTriangles(int arr[]){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]&&
                       arr[i]+arr[k]>arr[j]&&
                       arr[j]+arr[k]>arr[i])
                        c++;
                }
            }
        }

        return c;
    }
    void main(){
        Q6 ob=new Q6();
        int a[]={1,2,3,4,5};

        System.out.println("Number of Triangles: "+ob.countTriangles(a));
    }
}