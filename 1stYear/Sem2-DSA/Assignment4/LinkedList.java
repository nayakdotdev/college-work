/*
Problem Statement:
1. Write a menu driven Java Program using class, methods and reference variables, to construct
a singly linked list consisting of the following information in each node: student regd_no
(int), mark secured in a subject (float).
The class definition should be as follows.
class Node
{
protected int regd_no;
protected float mark;
protected Node next;
}
The prototype of the create method should be as follows.
public static void create(Node start)
Define the methods for each of the following operations to be supported by the above
linked list are:
  a) The insertion operation
    i. At the beginning of the list
Method Prototype: public static Node InsBeg(Node start)
    ii. At the end of the list
Method Prototype: public static Node InsEnd(Node start)
    iii. At any position in the list
Method Prototype: public static Node InsAny(Node start)
  b) The deletion operation
    i. From the beginning of the list
Method Prototype: public static Node DelBeg(Node start)
    ii. From the end of the list
Method Prototype: public static Node DelEnd(Node start)
    iii. From any position in the list
Method Prototype: public static Node DelAny(Node start)
    iv. Deleting a node based on student regd_no. If the specified node is not present
in the list an error message should be displayed. Both the option should be
demonstrated.
  c) Search a node based on student regd_no and update the mark of the student. If the
specified node is not present in the list an error message should be displayed.
Method Prototype: public static void search(Node start)
  d) Sort the nodes of the linked list according to the mark secured by the student from
higher to lower.
Method Prototype: public static void sort(Node start)
  e) Count the number of nodes present in the linked list
Method Prototype: public static int count(Node start)
  f) Reverse the linked list
Method Prototype: public static Node reverse(Node start)
  g) Displaying all the nodes in the list
The prototype of the display function should be as follows.
public static void display(Node start)
*/

import java.util.Scanner;
class Node{
    protected int regd_no;
    protected float marks;
    protected Node next;
}
public class LinkedList{
    public static Node create(Node start){
        Scanner sc=new Scanner(System.in);
        Node p=new Node();
        System.out.println("Enter Registration No.");
        p.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        p.marks=sc.nextFloat();
        p.next=null;
        start=p;
        System.out.println("Want to create new Node (Y/N)?");
        char ch=sc.next().charAt(0);
        while(ch!='N'){
            Node q=new Node();
            System.out.println("Enter Registration No.");
            q.regd_no=sc.nextInt();
            System.out.println("Enter Marks");
            q.marks=sc.nextFloat();
            q.next=null;
            p.next=q;
            p=q;
            System.out.println("Want to create new Node (Y/N)?");
            ch=sc.next().charAt(0);
        }
        return start;
    }
    public static Node InsBeg(Node start){
        Scanner sc=new Scanner(System.in);
        Node temp=new Node();
        System.out.println("Enter Registration No.");
        temp.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        temp.marks=sc.nextFloat();
        temp.next=start;
        start=temp;
        return start;
    }
    public static Node InsEnd(Node start){
        Scanner sc=new Scanner(System.in);
        Node temp=new Node();
        System.out.println("Enter Registration No.");
        temp.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        temp.marks=sc.nextFloat();
        temp.next=null;
        if(start==null){
            start=temp;
            return start;
        }
        Node p=start;
        while(p.next!=null)
            p=p.next;
        p.next=temp;
        return start;
    }
    public static Node InsAny(Node start){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter location to insert");
        int pos=sc.nextInt();
        Node temp=new Node();
        System.out.println("Enter Registration No.");
        temp.regd_no=sc.nextInt();
        System.out.println("Enter Marks");
        temp.marks=sc.nextFloat();
        temp.next=null;
        if(pos==1){
            temp.next=start;
            start=temp;
            return start;
        }
        Node p=start;
        int i=1;
        while(i<pos-1&&p.next!=null){
            p=p.next;
            i++;
        }
        if(i!=pos-1){
            System.out.println("Invalid Position");
            return start;
        }
        temp.next=p.next;
        p.next=temp;
        return start;
    }
    public static Node DelBeg(Node start){
        if(start==null){
            System.out.println("SLL Empty, Deletion not Possible!");
            return start;
        }
        System.out.println("Deleted Student Registration No.: "+start.regd_no);
        System.out.println("Deleted Student Marks: "+start.marks);
        start=start.next;
        return start;
    }
    public static Node DelEnd(Node start){
        if(start==null){
            System.out.println("SLL Empty, Deletion not Possible!");
            return start;
        }
        if(start.next==null){
            System.out.println("Deleted Student Registration No.: "+start.regd_no);
            System.out.println("Deleted Student Marks: "+start.marks);
            start=null;
            return start;
        }
        Node temp=start;
        while(temp.next.next!=null)
            temp=temp.next;
        System.out.println("Deleted Student Registration No.: "+temp.next.regd_no);
        System.out.println("Deleted Student Marks: "+temp.next.marks);
        temp.next=null;
        return start;
    }
    public static Node DelAny(Node start){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Location to Delete");
        int loc=sc.nextInt();
        if(start==null){
            System.out.println("SLL is Empty, Deletion Not Possible!");
            return start;
        }
        if(loc==1){
            System.out.println("Deleted Student Registration No.: "+start.regd_no);
            System.out.println("Deleted Student Marks: "+start.marks);
            start=start.next;
            return start;
        }
        Node temp=start;
        int c=1;
        while(c<loc-1&&temp.next!=null){
            temp=temp.next;
            c++;
        }
        if(c!=loc-1){
            System.out.println("Invalid Location");
            return start;
        }
        System.out.println("Deleted Student Registration No.: "+temp.next.regd_no);
        System.out.println("Deleted Student Marks: "+temp.next.marks);
        temp.next=temp.next.next;
        return start;
    }
    public static void search(Node start){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Registration No. to be Searched");
        int sreg=sc.nextInt();
        Node temp=start;
        while(temp!=null){
            if(temp.regd_no==sreg){
                System.out.println("Update Marks");
                temp.marks=sc.nextFloat();
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student Not Found!");
    }
    public static void sort(Node start){
        if(start==null){
            System.out.println("SLL is empty, Sorting Not Possible!");
            return;
        }
        Node curr=start,index;
        while(curr!=null){
            index=curr.next;
            while(index!=null){
                if(curr.marks<index.marks){
                    int t1=curr.regd_no;
                    curr.regd_no=index.regd_no;
                    index.regd_no=t1;
                    float t2=curr.marks;
                    curr.marks=index.marks;
                    index.marks=t2;
                }
                index=index.next;
            }
            curr=curr.next;
        }
    }
    public static int count(Node start){
        int c=0;
        Node temp=start;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static Node reverse(Node start){
        Node prev=null,curr=start,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        start=prev;
        return start;
    }
    public static void display(Node start){
        Node temp=start;
        while(temp!=null){
            System.out.print(temp.regd_no+"|"+temp.marks+"--->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node start=null;
        int ch;
        while(true){
            System.out.println("****MENU****");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Insert Student Info at Beginning");
            System.out.println("4. Insert Student Info at any Position");
            System.out.println("5. Insert Student Info at End");
            System.out.println("6. Delete Student Info at Beginning");
            System.out.println("7. Delete Student Info at any Location");
            System.out.println("8. Delete Student Info at End");
            System.out.println("9. Search Student");
            System.out.println("10. Count No. of Student");
            System.out.println("11. Sort Student according to Marks");
            System.out.println("12. Reverse Linked List");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 0:
                    System.exit(0);
                case 1:
                    start=create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start=InsBeg(start);
                    break;
                case 4:
                    start=InsAny(start);
                    break;
                case 5:
                    start=InsEnd(start);
                    break;
                case 6:
                    start=DelBeg(start);
                    break;
                case 7:
                    start=DelAny(start);
                    break;
                case 8:
                    start=DelEnd(start);
                    break;
                case 9:
                    search(start);
                    break;
                case 10:
                    System.out.println("No. of Student(s): "+count(start));
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    start=reverse(start);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}