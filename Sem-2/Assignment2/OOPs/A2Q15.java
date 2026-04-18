/*
Problem Statement:
A point in the x-y plane is represented by its x-coordinate and y coordinate.
Design a class, PointType in Java, that can store and process a point in the x-y plane. You should then perform operations on the point, such as showing the point, setting the coordinates of the point, printing the coordinates of the point, returning the x-coordinate, and returning the y- coordinate. Every circle has a centre and a radius. Given the radius, we can determine the circle’s area and circumference. Given the centre, we can determine its position in the x-y plane. The centre of a circle is a point in the x-y plane. Design a class, CircleType that can store the radius and centre of the circle. Because the center is a point in the x-y plane and you designed the class to capture the properties of a point from PointType class. You must derive the class CircleType from the class PointType. You should be able to perform the usual operations on a circle, such as setting the radius, printing the radius, calculating and printing the area and circumference, and carrying out the usual operations on the center.
*/

class PointType{
    double x,y;
    void setPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    double pointX(){
        return x;
    }
    double pointY(){
        return y;
    }
    void showCoordinates(){
        System.out.println("X-Coordinate: "+pointX());
        System.out.println("Y-Coordinate: "+pointY());
    }
    void showPoint(){
        System.out.println("Point is ("+pointX()+","+pointY()+")");
    }
}
class CircleType extends PointType{
    double radius;
    void setRadius(double radius){
        this.radius=radius;
    }
    void showRadius(){
        System.out.println("Radius is "+radius);
    }
    void area(){
        System.out.println("Area is "+Math.PI*radius*radius);
    }
    void circumference(){
        System.out.println("Circumference is "+2*Math.PI*radius);
    }
    void setCenter(double x,double y){
        setPoint(x,y);
        showCoordinates();
        showPoint();
    }
}
public class A2Q15 {
    public static void main(String[] args) {
        CircleType ob=new CircleType();
        ob.setRadius(5);
        ob.showRadius();
        ob.area();
        ob.circumference();
        System.out.println("About CenterPoint");
        ob.setCenter(2.6,3.5);
    }
}