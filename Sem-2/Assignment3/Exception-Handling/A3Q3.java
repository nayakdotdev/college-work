/*
Problem Statement:

*/

import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String s){
        super(s);
    }
}
class Student{
    String name;
    int mark;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter marks: ");
        mark=sc.nextInt();
        sc.close();
    }
    public void validate(int mark) throws MarksOutOfBoundException{
        if(mark<=100)
            System.out.println("Marks is "+mark);
        else
            throw new MarksOutOfBoundException("Mark is Invalid");
    }
    void display(){
        System.out.println("Name is "+name);
        try{
            validate(mark);
        }
        catch(MarksOutOfBoundException ob){
            System.out.println(ob.getMessage());
        }
    }
}
public class A3Q3 {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.getdata();
        ob.display();
    }
}