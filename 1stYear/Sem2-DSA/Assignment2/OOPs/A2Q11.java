/*
Problem Statement:
Define a class called Student with instance variables Roll, Name, DSA_Mark.
Also, the class consists of instance methods
• getdata( ): To provide input to the instance variable
• showdata( ): To display the value of instance variable.
Write a program to create the details of 5 students. Display the information of the students who has secured the highest DSA_Mark.
*/

import java.util.Scanner;
class Student{
    String name;
    int roll;
    double dsa_mark;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter Roll no: ");
        roll=sc.nextInt();
        System.out.print("Enter DSA Marks: ");
        dsa_mark=sc.nextDouble();
    }
    void showdata(){
        System.out.println("Name is "+name);
        System.out.println("Roll No is "+roll);
        System.out.println("DSA Marks is "+dsa_mark);
    }
}
public class A2Q11{
    public static void main(String[] args) {
        Student S[]=new Student[5];
        double hi_dsa=0;
        for(int i=0;i<5;i++){
            S[i]=new Student();
            S[i].getdata();
            hi_dsa=Math.max(hi_dsa,S[i].dsa_mark);
        }
        System.out.println("Student with Highest DSA Mark");
        for(int i=0;i<5;i++){
            if(S[i].dsa_mark==hi_dsa){
                S[i].showdata();
                break;
            }
        }
    }
}