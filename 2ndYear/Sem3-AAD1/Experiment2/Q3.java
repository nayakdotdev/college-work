class Q3{
    void decToHex(int n){
        if(n==0)
            return;
        decToHex(n/16);
        if(n%16<10)
            System.out.print(n%16);
        else
            System.out.print((char)('A'+(n%16-10)));
    }
    void main(){
        decToHex(75055);
    }
}