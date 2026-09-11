/*
Problem Statement:
Static Implementation (Array Implementation)
A stack is implemented statically by using an array of size MAX to hold stack elements and an
integer top storing the position of top of the stack. The stack elements can be integers, characters,
strings or user defined data types.
The operations to be performed on a stack are
- public static int push(int S[],int top) – adding an element x to the stack S
- public static int pop(int S[],int top)– deletes and returns the top element from the stack
- public static void display(int S[],int top)- display all the elements of Stack S
- public static boolean isEmpty(int top) – check if the stack is empty
- public static boolean isFull(int top) – check if the stack is full when top equals MAX -1
Write a menu driven Java Program using class, methods and array, to construct a Stack and
implement the above five operations.
*/

import java.util.Scanner;
class SNode{
    int info;
    SNode next;
}
public class StackDemo2 {
    static Scanner sc=new Scanner(System.in);
    public static SNode push(SNode top){
        SNode q=new SNode();
        System.out.println("Enter info");
        q.info=sc.nextInt();
        q.next=top;
        top=q;
        return top;
    }
    public static SNode pop(SNode top){
        if(top==null){
            System.out.println("Underflow, Deletion Not Possible!");
            return top;
        }
        System.out.println("Deleted info: "+top.info);
        top=top.next;
        return top;
    }
    public static void display(SNode top){
        if(top==null){
            System.out.println("Stack is Empty");
            return;
        }
        SNode temp=top;
        while(temp!=null){
            System.out.print(temp.info);
            if(temp.next!=null)
                System.out.print("--->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SNode top=null;
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
                    top=push(top);
                    break;
                case 2:
                    top=pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}