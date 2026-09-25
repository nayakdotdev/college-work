// Tower of Hanoi: We are given three rods and N number of disks, initially all the disks
// are added to the first rod (the leftmost one) is in decreasing size order. The objective is
// to transfer the entire stack of disks from the first tower to the third tower (the rightmost
// one), moving only one disk at a time and never a large one onto a smaller one. Write a
// program in recursive approach to print the sequence of moves during the process.

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