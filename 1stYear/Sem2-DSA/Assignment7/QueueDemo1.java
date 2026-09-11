/*
Problem Statement:
Static Implementation (Array Implementation)
A Queue is implemented statically by using an array of size MAX to hold the elements and it has
two ends (integers) – front and rear. The ‘front’ stores the position of the current front element
and ‘rear’ stores the position of the current rear element of the queue. The Queue elements can be
integers, characters, strings or user defined data types.
The operations to be performed on a Queue are
- public static void insert(int Q[])-adding an element x to the rear end of the queue Q
- public static void delete(int Q[])-deletes the element from the front of the queue Q
- public static void display(int Q[])-display all the elements of the queue Q.
- public static boolean is_full()-check if the queue is full or not.
- public static boolean is_empty()-check if the queue is empty or not.
Write a menu driven Java Program using class, methods and array, to construct a Queue and
implement the above five operations.
*/

import java.util.Scanner;
public class QueueDemo1 {
    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;
    static Scanner sc=new Scanner(System.in);
    public static void insert(int Q[]){
        if(is_full()){
            System.out.println("Queue is Full");
            return;
        }
        if(rear==-1)
            front=0;
        System.out.println("Enter element");
        Q[++rear]=sc.nextInt();
    }
    public static void delete(int Q[]){
        if(is_empty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted element is "+Q[front++]);
        if(front>rear){
            front=-1;
            rear=-1;
        }
    }
    public static void display(int Q[]){
        if(is_empty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<=rear;i++)
            System.out.print(Q[i]+" ");
        System.out.println();
    }
    public static boolean is_full(){
        return rear==MAX-1;
    }
    public static boolean is_empty(){
        return front==-1||front>rear;
    }
    public static void main(String[] args) {
        int q[]=new int[MAX];
        while(true){
            System.out.println("****MENU****");
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("Enter your Choice");
            int ch=sc.nextInt();
            switch(ch){
                case 0:
                    System.exit(0);
                case 1:
                    insert(q);
                    break;
                case 2:
                    delete(q);
                    break;
                case 3:
                    display(q);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}