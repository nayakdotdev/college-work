// Which of the sorting technique out of Bubble Sort, Selection Sort and Insertion Sort
// can be modified to get a linear time program to determine whether a given list of
// integers is sorted in increasing order or not.
// Input: 12,23,34,56,78 Output: Yes
// Input: 12,23,45,32,56,78 Output: No

class Q1{
    boolean checkSorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
    void main(){
        Q1 ob=new Q1();
        int a[]={12,23,34,56,78};
        int b[]={12,23,45,32,56,78};
        System.out.println(ob.checkSorted(a)?"Yes":"No");
        System.out.println(ob.checkSorted(b)?"Yes":"No");
    }
}