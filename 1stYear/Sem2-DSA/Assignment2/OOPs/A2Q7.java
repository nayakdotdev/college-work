/*
Problem Statement:
Define a base class Shape with an instance variable color. The instance variable is initialized through the constructor. The prototype of the constructor is as below: Shape (String)
Define two derived classes Circle and Rectangle, both inheriting from the Shape class.
Class Circle:
• Has an additional instance variable radius, initialized through the constructor.
• The constructor prototype is: Circle (String, double)
• A method area () to calculate the area of the circle: π * radius2.
Class Rectangle:
• Has two additional instance variables length and width, initialized through the constructor.
• The constructor prototype is: Rectangle (String, double, double)
• A method area () to calculate the area of the rectangle: length * width.
Both the Circle and Rectangle classes should have a method display () to display the shape's details, including color and the area of the respective shape.
Write a program to:
1. Create objects for both Circle and Rectangle.
2. Initialize their properties.
3. Display their details using the display () method.
*/

class Shape{
    String color;
    Shape(String color){
        this.color=color;
    }
}
class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    void display(){
        System.out.println("Circle Colour is "+color);
        System.out.println("Circle Area is "+area());
    }
}
class Rectangle extends Shape{
    double length,breadth;
    Rectangle(String color,double length,double breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }
    void display(){
        System.out.println("Rectangle Colour is "+color);
        System.out.println("Rectangle Area is "+area());
    }
}
public class A2Q7 {
    public static void main(String[] args) {
        Circle ob=new Circle("Red",5);
        Rectangle ob1=new Rectangle("Yellow",10,15);
        ob.display();
        ob1.display();
    }
}