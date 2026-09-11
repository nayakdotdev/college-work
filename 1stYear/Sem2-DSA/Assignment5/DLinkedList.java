/*
Problem Statement:
1. Write a menu driven Java Program using class, methods and reference variables, to construct
a doubly linked list consisting of the following information in each node: student regd_no
(int), mark secured in a subject (float).
The class definition should be as follows.
class Node
{
protected int regd_no;
protected float mark;
protected Node next;
protected Node prev;
}
The prototype of the create method should be as follows.
public static Node create(Node start, Node end)
Define the methods for each of the following operations to be supported by the above
linked list are:
  a) The insertion operation
    i. At the beginning of the list
Method Prototype: public static Node insBeg(Node start, Node end)
    ii. At the end of the list
Method Prototype: public static Node insEnd(Node start, Node end)
    iii. At any position in the list
Method Prototype: public static Node insAny(Node start, Node end)
  b) The deletion operation
    i. From the beginning of the list
Method Prototype: public static Node delBeg(Node start, Node end)
    ii. From the end of the list
Method Prototype: public static Node delEnd(Node start, Node end)
    iii. From any position in the list
Method Prototype: public static Node delAny(Node start, Node end)
  c) Search a node based on student regd_no and update the mark of the student. If the
specified node is not present in the list an error message should be displayed.
Method Prototype: public static void search(Node start)
  d) Displaying all the nodes in the list
The prototype of the display method should be as follows.
public static void display(Node start, Node end)
*/

import java.util.Scanner;
class DLLNode{
    protected int regd_no;
    protected float marks;
    protected DLLNode next;
    protected DLLNode prev;
}
public class DLinkedList {
    static DLLNode start=null,end=null;
    static Scanner sc=new Scanner(System.in);
    public static void create(){
        DLLNode p=new DLLNode();
        System.out.println("Enter Registration No.");
        p.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        p.marks=sc.nextFloat();
        start=p;
        end=p;
        System.out.println("Want to add more Nodes? (Y/N)");
        char ch=sc.next().charAt(0);
        while(ch!='N'){
            DLLNode q=new DLLNode();
            System.out.println("Enter Registration No.");
            q.regd_no=sc.nextInt();
            System.out.println("Enter Marks");
            q.marks=sc.nextFloat();
            p.next=q;
            q.prev=p;
            end=q;
            p=q;
            System.out.println("Want to add more Nodes? (Y/N)");
            ch=sc.next().charAt(0);
        }
    }
    public static void insBeg(){
        DLLNode p=new DLLNode();
        System.out.println("Enter Registration No.");
        p.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        p.marks=sc.nextFloat();
        p.prev=null;
        p.next=start;
        if(start!=null)
            start.prev=p;
        start=p;
        if(end==null)
            end=p;
    }
    public static void insEnd(){
        DLLNode p=new DLLNode();
        System.out.println("Enter Registration No.");
        p.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        p.marks=sc.nextFloat();
        p.next=null;
        if(start==null){
            p.prev=null;
            start=p;
            end=p;
        }
        else{
            end.next=p;
            p.prev=end;
            end=p;
        }
    }
    public static void insAny(){
        System.out.println("Enter position to Insert");
        int pos=sc.nextInt();
        DLLNode p=new DLLNode();
        System.out.println("Enter Registration No.");
        p.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        p.marks=sc.nextFloat();
        if(pos==1){
            p.next=start;
            if(start!=null)
                start.prev=p;
            start=p;
            if(end==null)
                end=p;
            return;
        }
        DLLNode temp=start;
        int i=1;
        while(i<pos-1&&temp.next!=null){
            temp=temp.next;
            i++;
        }
        if(i!=pos-1){
            System.out.println("Invalid Position");
            return;
        }
        if(temp.next==null){
            temp.next=p;
            p.prev=temp;
            p.next=null;
            end=p;
        }
        else{
            temp.next.prev=p;
            p.next=temp.next;
            temp.next=p;
            p.prev=temp;
        }
    }
    public static void delBeg(){
        if(start==null){
            System.out.println("DLL is Empty, Deletion Not Possible!");
            return;
        }
        start=start.next;
        if(start!=null)
            start.prev=null;
    }
    public static void delEnd(){
        if(start==null){
            System.out.println("DLL is empty, Deletion Not Possible!");
            return;
        }
        if(start.next==null){
            System.out.println("Registration No. of Deleted Student: "+start.regd_no);
            System.out.println("Marks of Deleted Student: "+start.marks);
            start=null;
            end=null;
            return;
        }
        System.out.println("Registration No. of Deleted Student: "+end.regd_no);
        System.out.println("Marks of Deleted Student: "+end.marks);
        end=end.prev;
        end.next=null;
    }
    public static void delAny(){
        if(start==null){
            System.out.println("DLL is Empty, Deletion Not Possible!");
            return;
        }
        System.out.println("Enter Location to Delete Node");
        int loc=sc.nextInt();
        if(loc==1){
            start=start.next;
            if(start!=null)
                start.prev=null;
            return;
        }
        DLLNode temp=start;
        int i=1;
        while(i<loc&&temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Invalid Location");
            return;
        }
        if(temp.next!=null)
            temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }
    public static void search(){
        if(start==null){
            System.out.println("DLL is Empty, Search Not Possible!");
            return;
        }
        System.out.println("Enter Registration No. to be Searched");
        int sregd=sc.nextInt();
        DLLNode temp=start;
        while(temp!=null){
            if(temp.regd_no==sregd){
                System.out.println("Update Marks");
                temp.marks=sc.nextFloat();
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student Not Found!");
    }
    public static void display(){
        if(start==null){
            System.out.println("DLL is Empty!");
            return;
        }
        DLLNode temp=start;
        while(temp!=null){
            System.out.print(temp.regd_no+"|"+temp.marks+"--->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        while(true){
            System.out.println("****MENU****");
            System.out.println("0. Exit");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert Student Info at Beginning");
            System.out.println("4. Insert Student Info at Any Position");
            System.out.println("5. Insert Student Info at End");
            System.out.println("6. Delete Student Info at Beginning");
            System.out.println("7. Delete Student Info at Any Location");
            System.out.println("8. Delete Student Info at End");
            System.out.println("9. Search Student");
            System.out.print("Enter Choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    insBeg();
                    break;
                case 4:
                    insAny();
                    break;
                case 5:
                    insEnd();
                    break;
                case 6:
                    delBeg();
                    break;
                case 7:
                    delAny();
                    break;
                case 8:
                    delEnd();
                    break;
                case 9:
                    search();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}