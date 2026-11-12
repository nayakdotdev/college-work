// Given an array of size N, which contains integers from 1 to N. Elements can appear
// any number of times. Print the frequency of all elements in the array and also print
// the frequency of missing elements as 0.
// INPUT: N:5 {1,4,3,4,2} OUTPUT:{1:1},{2:1},{3:1}.{4:2},{5:0}

class Q6{
    void frequency(int arr[],int n){
        int freq[]=new int[n+1];
        for(int x:arr)
            freq[x]++;
        for(int i=1;i<=n;i++)
            System.out.println(i+":"+freq[i]);
    }
    void main(){
        Q6 ob=new Q6();
        int a[]={1,4,3,4,2};
        ob.frequency(a,5);
    }
}