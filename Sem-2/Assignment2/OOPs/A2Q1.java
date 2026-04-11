/*
Problem Statement:
Define a class Car with two instance variables: model and year
Two member methods are:
• setDetails(): Set the details of the car.
• displayDetails(): Display the details of the car.
Now, create two objects of the Car class:
• Initialize the first object's values directly (by using the dot. operator) with model: "Toyota" and year: 2020.
• Accept the model and year through the keyboard input and set them to another object using the setDetails() method.
Now, display the details of both cars using the displayDetails() method.
Also, check which car is newer.
*/

import java.util.Scanner;
class Car{
    String model;
    int year;
    void setDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter model: ");
        model=sc.next();
        System.out.print("Enter year: ");
        year=sc.nextInt();
        sc.close();
    }
    void displayDetails(){
        System.out.println("Model is "+model);
        System.out.println("Year is "+year);
    }
}
public class A2Q1 {
    public static void main(String[] args) {
        Car ob1=new Car();
        Car ob2=new Car();
        ob1.model="Toyota";
        ob1.year=2020;
        ob2.setDetails();
        ob1.displayDetails();
        ob2.displayDetails();
        if(ob1.year>ob2.year)
            System.out.println(ob1.model+" is Newer");
        else
            System.out.println(ob2.model+" is Newer");
    }
}