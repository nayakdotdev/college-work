class Q4{
    void hanoi(int n,String a,String b,String c){
        if(n==1)
            System.out.println(a+"--->"+c);
        else{
            hanoi(n-1,a,c,b);
            System.out.println(a+"--->"+c);
            hanoi(n-1,b,a,c);
        }
    }
    void main(){
        hanoi(3, "A", "B", "C");
    }
}