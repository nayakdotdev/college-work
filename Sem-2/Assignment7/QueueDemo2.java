/*
Problem Statement:
Dynamic Implementation (Linked List Implementation)
A Queue is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the queue.
The class definition of Node is given below.
class Node
{
int info;
Node next;
}
The Queue elements can be integers, characters, strings or user defined types. There is no restriction
on how big the Queue can grow.
The operations to be performed on a Queue:
- public static Node insert (Node rear, Node front) - adding an element x to the queue
Q requires creation of node containing x and putting it next to the rear and rear points to the newly
added element.
- public static Node delete (Node rear, Node front) - deletes the front node from the
queue Q
- public static void display (Node rear, Node front)-display all the elements of
the queue Q.
Write a menu driven Java Program using class, methods and list, to construct a Queue and
implement the above three operations.
*/

import java.util.Scanner;
class QNode{
    int info;
    QNode next;
}
public class QueueDemo2 {
    static Scanner sc=new Scanner(System.in);
    static QNode front=null,rear=null;
    public static void insert(){
        QNode q=new QNode();
        System.out.println("Enter info");
        q.info=sc.nextInt();
        q.next=null;
        if(front==null){
            front=q;
            rear=q;
        }
        rear.next=q;
        rear=q;
    }
    public static void delete(){
        if(front==null){
            System.out.println("Queue is Empty, Deletion Not Possible!");
            return;
        }
        System.out.println("Deleted Node info "+front.info);
        front=front.next;
        if(front==null)
            rear=null;
    }
    public static void display(){
        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }
        QNode temp=front;
        while(temp!=null){
            System.out.print(temp.info);
            if(temp.next!=null)
                System.out.print("--->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
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
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }   
}