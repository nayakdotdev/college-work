// Factorial of a number

class Q2 {
    int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }
    void main(){
        Q2 ob=new Q2();
        System.out.println(ob.fact(5));
    }
}