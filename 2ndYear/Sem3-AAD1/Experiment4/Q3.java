// Given a list n numbers, find the element which appears maximum number of times.

class Q3{
    void maxFrequency(int arr[]){
        int max=0,element=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c>max){
                max=c;
                element=arr[i];
            }
        }
        System.out.println("Element: "+element);
        System.out.println("Frequency: "+max);
    }
    void main(){
        Q3 ob=new Q3();
        int a[]={1,2,3,2,4,2,5};
        ob.maxFrequency(a);
    }
}