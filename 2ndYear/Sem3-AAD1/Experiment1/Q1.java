// Sum of n numbers

class Q1{
    int sum(int lb,int ub){
        int s=0;
        for(int i=lb;i<=ub;i++)
            s+=i;
        return s;
    }
    void main(){
        Q1 ob=new Q1();
        System.out.println(ob.sum(5,10));
    }
}