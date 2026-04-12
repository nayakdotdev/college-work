/*
Problem Statement:
In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking
out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on
the top and the largest is on the bottom. The puzzle is to move all the disks from peg a to
peg c, moving one disk at a time, so that we never place a larger disk on top of a smaller
one. See Figure 1 for an example of the case n = 4. Write a recursive program using Java
for solving the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the subproblem
of moving all but the nth disk from peg a to another peg using the third as “temporary
storage.”)
*/

import java.util.Scanner;
public class A3Q18 {
    public static void Hanoi(int n,char a,char b,char c){
        if(n==1)
            System.out.println(a+"--->"+c);
        else{
            Hanoi(n-1,a,c,b);
            System.out.println(a+"--->"+c);
            Hanoi(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n=sc.nextInt();
        System.out.println("Steps to solve Hanoi");
        Hanoi(n,'A','B','C');
        sc.close();
    }
}