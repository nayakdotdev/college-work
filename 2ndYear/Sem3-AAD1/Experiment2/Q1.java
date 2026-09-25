// Write the recursive code of the following problems
// - Sum of even digits of a given number (Input: 43721 Output: 4+2=6)
// - Factorial of a number
// - Print n terms of Fibonacci sequence in reverse order.

class Q1{
    int sumEven(int n){
        if(n==0)
            return 0;
        int ld=n%10;
        if(ld%2==0)
            return ld+sumEven(n/10);
        else
            return sumEven(n/10);
    }
    int fact(int n){
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
    void fiboRev(int n,int a,int b){
        if(n>0)
            fiboRev(n-1,b,a+b);
        System.out.print(a+" ");
    }
    void main(){
        System.out.println("Sum of Even Digits: "+sumEven(43721));
        System.out.println("Factorial: "+fact(5));
        fiboRev(7, 0, 1);
    }
}