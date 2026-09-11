/*
Problem Statement:
Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
- Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
- Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
- Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.
*/

class Box<T>{
    private T msg;
    Box(T msg){
        this.msg=msg;
    }
    public void add(T t){
        msg=t;
    }
    public T get(){
        return msg;
    }
}
public class A3Q4 {
    public static void main(String[] args) {
        Box <String> ob=new Box<String>("Welcome");
        Box <String> ob1=ob;
        System.out.println(ob.get());
        System.out.println(ob1.get());
        ob.add("Welcome to Genesis");
        System.out.println(ob.get());
        System.out.println(ob1.get());
        Box <Integer> ob2=new Box<Integer>(5);
        Box <Integer> ob3=ob2;
        System.out.println(ob2.get());
        System.out.println(ob3.get());
        ob2.add(15);
        System.out.println(ob2.get());
        System.out.println(ob3.get());
        Box <Object> ob4=new Box<Object>("Welcome");
        Box <Object> ob5=ob4;
        System.out.println(ob4.get());
        System.out.println(ob5.get());
        ob4.add(5);
        System.out.println(ob4.get());
        System.out.println(ob5.get());
    }
}
