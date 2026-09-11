/*
Problem Statement:
Create a class Bank with two instance variables:
bankNname, depositAmount and a class variable totalAamount.
Defined three member methods:
• setBankName() to set the bank name
• setAmount() to set the deposit amount
• showData() for displaying the bank name and deposit amount.
A person visited 5 different banks and deposit money. Create 5 array object of class Bank set the bank name and deposit amount (the minimum deposit amount is 1000) using member methods setBankName() and setAmount(). Call the showData() method to display the information with totalAmount deposited by the person. Also, design a method that displays the bank name where the person deposits the minimum amount.
*/

import java.util.Scanner;
class Bank{
    String bankName;
    double depositAmount;
    static double totalAmount;
    void setBankName(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Bank Name: ");
        bankName=sc.nextLine();
    }
    void setDepositAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Deposit Amount: ");
        depositAmount=sc.nextDouble();
        if(depositAmount>=1000)
            totalAmount+=depositAmount;
        else
            System.out.println("Minimum Deposit Amount is 1000!");
    }
    void showData(){
        System.out.println("Bank Name is "+bankName);
        System.out.println("Deposit Amount is "+depositAmount);
    }
}
public class A2Q13 {
    public static void main(String[] args) {
        Bank B[]=new Bank[5];
        double minDeposit=Double.MAX_VALUE;
        for(int i=0;i<5;i++){
            B[i]=new Bank();
            B[i].setBankName();
            B[i].setDepositAmount();
            B[i].showData();
            minDeposit=Math.min(minDeposit,B[i].depositAmount);
        }
        System.out.println("Total Amount Deposited: "+Bank.totalAmount);
        System.out.println("Minimum Amount Deposited at: ");
        for(int i=0;i<5;i++){
            if(B[i].depositAmount==minDeposit){
                B[i].showData();
                break;
            }
        }
    }
}