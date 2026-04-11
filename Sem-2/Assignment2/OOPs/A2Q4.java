/*
Problem Statement:
Define a class Deposit. The instance variable of the class Deposit is mentioned below.
Instance Variable
• long Principal
• integer Time
• double Rate
• double Total_amt
Initialize the instance variables Principal, Time, rate through constructors.
Constructors are overloaded with the following prototypes.
• Constructor1: Deposit ()
• Constructor2: Deposit (long, int, double)
• Constructor3: Deposit (long, int)
• Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are
• display ( ): To display the value of instance variables
• calc_amt( ): To calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;
*/

import java.util.Scanner;
class Deposit{
    long principal;
    int time;
    double rate,total_amt;
    Scanner sc=new Scanner(System.in);
    Deposit(){
        System.out.print("Enter Principal: ");
        principal=sc.nextLong();
        System.out.print("Enter Time: ");
        time=sc.nextInt();
        System.out.print("Enter rate: ");
        rate=sc.nextDouble();
    }
    Deposit(long principal,int time,double rate){
        this.principal=principal;
        this.time=time;
        this.rate=rate;
    }
    Deposit(long principal,int time){
        this.principal=principal;
        this.time=time;
        System.out.print("Enter rate: ");
        rate=sc.nextDouble();
    }
    Deposit(long principal,double rate){
        this.principal=principal;
        System.out.print("Enter Time: ");
        time=sc.nextInt();
        this.rate=rate;
    }
    void display(){
        System.out.println("Principal is "+principal);
        System.out.println("Time is "+time);
        System.out.println("Rate is "+rate);
    }
    void calc_amt(){
        total_amt=principal+(principal*rate*time)/100;
        System.out.println("Total Amount is "+total_amt);
    }
}
public class A2Q4 {
    public static void main(String[] args) {
        Deposit ob=new Deposit();
        ob.display();
        ob.calc_amt();
        Deposit ob1=new Deposit(12345,4,2.5);
        ob1.display();
        ob1.calc_amt();
        Deposit ob2=new Deposit(12345,4);
        ob2.display();
        ob2.calc_amt();
        Deposit ob3=new Deposit(12345,2.5);
        ob3.display();
        ob3.calc_amt();
    }
}