/*
Problem Statement:
Define a base class Distance with the following instance variables:
• feet (an integer representing the distance in feet)
• inches (an integer representing the distance in inches)
The Distance class should have:
• A constructor to initialize feet and inches.
• A method displayDistance() to display the distance in the format: feet' inches".
Now, define a derived class Measurement that extends the Distance class and adds an additional instance variable centimetres (a double representing the distance in centimetres).
The Measurement class should:
• Have a constructor that uses the super keyword to call the Distance class's constructor to initialize feet and inches.
• Include a centimetres field, which should be initialized in the constructor.
• Implement a method displayMeasurement() that calls the displayDistance() method from the Distance class (using super) to display the distance in feet and inches, and also displays the distance in centimeters.
*/

class Distance{
    int feet,inches;
    Distance(int feet,int inches){
        this.feet=feet;
        this.inches=inches;
    }
    void displayDistance(){
        System.out.println(feet+"' "+inches);
    }
}
class Measurement extends Distance{
    double centimetres;
    Measurement(int feet,int inches,double centimetres){
        super(feet,inches);
        this.centimetres=centimetres;
    }
    void displayMeasurement(){
        super.displayDistance();
        System.out.println(centimetres+" cm");
    }
}
public class A2Q14 {
    public static void main(String[] args) {
        Measurement ob=new Measurement(5,11,189.46);
        ob.displayMeasurement();
    }
}