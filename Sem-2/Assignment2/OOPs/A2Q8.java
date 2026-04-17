/*
Problem Statement:
Define two interfaces, Flyable and Swimmable, with the following methods:
Interface Flyable:
• A method fly () (e.g., "Flying not flying").
Interface Swimmable:
• A method swim () (e.g., "Swimming or not swimming").
Define a class Duck that implements both Flyable and Swimmable interfaces. This class should:
• Implement the fly () method from Flyable interface.
• Implement the swim () method from Swimmable interface.
• Include an additional instance variable name (a String) to store the name of the duck, initialized through the constructor.
• A displayDetails() method to display the duck's name and its capabilities (whether it can fly or swim).
Write a program to:
• Create an object of Duck and initialize its name.
• Call the fly() and swim() methods using the Duck object.
• Display the duck's name and its abilities using the displayDetails() method.
*/

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    String name;
    Duck(String name){
        this.name=name;
    }
    public void fly(){
        System.out.println(name+" can fly");
    }
    public void swim(){
        System.out.println(name+" can swim");
    }
    void displayDetails(){
        System.out.println("Duck name is "+name);
        fly();
        swim();
    }
}
public class A2Q8{
    public static void main(String[] args) {
        Duck ob=new Duck("Donald");
        ob.displayDetails();
    }
}