/*
Problem Statement:
Dynamic Implementation (Linked List Implementation)
A stack is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the stack. The class
defintion of Node is given below.
class Node
{
int info;
Node next;
}
The stack elements can be integers, characters, strings or user defined data types. There is no
restriction on how big the stack can grow.
The operations to be performed on a stack are
- public static Node push(Node top) - Add an element x to the stack S requires creation of
node containing x and putting it in front of the top node pointed by S.
- public static Node pop(Node top)- Delete the top node from the stack S so that next
element becomes the top.
- public static void display(Node top)- Display all the elements of Stack S.
Write a menu driven Java Program using class, methods and list, to construct a Stack and
implement the above three operations.
*/

import java.util.Scanner;
public class StackDemo1 {
    public static final int MAX=10;
    static Scanner sc=new Scanner(System.in);
    public static int push(int S[],int top){
        if(isFull(top)){
            System.out.println("Overflow");
            return top;
        }
        System.out.println("Enter Stack Element");
        S[++top]=sc.nextInt();
        return top;
    }
    public static int pop(int S[],int top){
        if(isEmpty(top)){
            System.out.println("Underflow");
            return top;
        }
        System.out.println("Deleted Element: "+S[top--]);
        return top;
    }
    public static void display(int S[],int top){
        if(isEmpty(top)){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=top;i>=0;i--)
            System.out.print(S[i]+" ");
        System.out.println();
    }
    public static boolean isEmpty(int top){
        return top==-1;
    }
    public static boolean isFull(int top){
        return top==MAX-1;
    }
    public static void main(String[] args) {
        int st[]=new int[MAX];
        int top=-1;
        while(true){
            System.out.println("****MENU****");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("Enter your Choice");
            int ch=sc.nextInt();
            switch(ch){
                case 0:
                    System.exit(0);
                case 1:
                    top=push(st,top);
                    break;
                case 2:
                    top=pop(st,top);
                    break;
                case 3:
                    display(st,top);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}