/*
Problem Statement:
Define a class named Book with the following member variables:
• bookId (an integer representing the unique ID of the book)
• price (a double representing the price of the book)
• quantity (an integer representing the quantity of books purchased)
Additionally, include a static variable totalAmount to keep track of the total amount spent on all books.
The class should have:
• A parameterized constructor to initialize the bookId, price, and quantity. Note: Use “this”.
• A displayDetails() method to print the details of the book (i.e., bookId, price, quantity).
• A method to calculate and return the total cost for that book (price * quantity).
• Update the static variable totalAmount to include the total cost of the book purchased.
Now, write a separate Main class to simulate the purchasing of 5 different books. Display the details of each book, and finally, display the total amount spent on the purchase of all books.
*/

import java.util.Scanner;
class Book{
    int bookID,quantity;
    double price;
    static double totalAmount;
    Book(int bookID,double price,int quantity){
        this.bookID=bookID;
        this.price=price;
        this.quantity=quantity;
    }
    void displayDetails(){
        System.out.println("Book ID is "+bookID);
        System.out.println("Price is "+price);
        System.out.println("Quantity is "+quantity);
    }
    double calculate(){
        double totalCost=price*quantity;
        totalAmount+=totalCost;
        return totalCost;
    }
}
public class A2Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b[]=new Book[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter BookID,price and quantity");
            b[i]=new Book(sc.nextInt(),sc.nextDouble(),sc.nextInt());
            b[i].displayDetails();
            System.out.println("Total Cost of this book is "+b[i].calculate());
        }
        System.out.println("Total Amount is "+Book.totalAmount);
        sc.close();
    }
}