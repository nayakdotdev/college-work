// Write a program to find the kth element of the ascending ordered list from a given list
// of n integers. (Say integers are within range 1 to 25 and k<n).
// {Input: The List [1, 7, 5, 4, 1, 22, 9, 7, 22, 4, 9, 18, 4] and k=5 Output:4}

class Q3{
    int kthElement(int arr[],int k){
        int freq[]=new int[26];
        for(int x:arr)
            freq[x]++;

        for(int i=1;i<=25;i++){
            k-=freq[i];

            if(k<=0)
                return i;
        }
        return -1;
    }
    void main(){
        Q3 ob=new Q3();
        int a[]={1,7,5,4,1,22,9,7,22,4,9,18,4};
        int k=5;
        System.out.println("Kth Element: "+ob.kthElement(a,k));
    }
}