// Generating nth Fibonacci number

class Q3{
    int fibo(int n){
        if(n==0||n==1)
            return n;
        int sl=0,l=1,curr=0;
        for(int i=2;i<=n;i++){
            curr=sl+l;
            sl=l;
            l=curr;
        }
        return curr;
    }
    void main(){
        Q3 ob=new Q3();
        System.out.println(ob.fibo(7));
    }
}