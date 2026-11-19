// Given a VALUE and two lists of integers X and Y. Find all pairs of elements
// (X[i],Y[j]) such that the absolute difference of X[i] and Y[j] is the VALUE, where i=j
// or i ≠ j.
// {Input: VALUE: 4 X: 1,5,4,3,7 Y:2,9,6,7,8 Output: (5,9), (4,8), (3,7)}

class Q2{
    void findPairs(int X[],int Y[],int value){
        for(int i=0;i<X.length;i++){
            for(int j=0;j<Y.length;j++){
                if(Math.abs(X[i]-Y[j])==value)
                    System.out.println("("+X[i]+","+Y[j]+")");
            }
        }
    }
    void main(){
        Q2 ob=new Q2();
        int X[]={1,5,4,3,7};
        int Y[]={2,9,6,7,8};
        int value=4;
        ob.findPairs(X,Y,value);
    }
}