/*
Problem Statement:
Define a base class Person with instance variable name, age.
The instance variables are initialized through constructors. The prototype of constructor is as below.
Person (String, int)
Define a derived class Employee with instance variables Eid, salary.
The instance variables are initialized through constructors. The prototype of constructor is as below. Employee (string, int, int, double).
Another instance method of Employee class is empDisplay() to display the information of employee details.
*/

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    int eid;
    double salary;
    Employee(String name,int age,int eid,double salary){
        super(name,age);
        this.eid=eid;
        this.salary=salary;
    }
    void empDisplay(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("ID is "+eid);
        System.out.println("Salary is "+salary);
    }
}
public class A2Q12 {
    public static void main(String[] args) {
        Employee ob=new Employee("Sanket",19,3456,90000);
        ob.empDisplay();
    }
}