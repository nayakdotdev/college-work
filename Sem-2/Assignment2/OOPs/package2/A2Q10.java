/*
Problem Statement:
Design a package that contains two classes Student & Test.
The Student class has data members as name, roll and instance methods
• inputDetails()
• showDetails().
Similarly, the Test class has data members as mark1, mark2 and instance methods
• inputDetails()
• showDetails()
Student is extended by Test. Another package carries interface Sports with 2 attributes score1, score2. Find grand total mark & score in another class
*/

package package2;
import package1.*;
public class A2Q10{
    public static void main(String[] args) {
        Test ob=new Test();
        ob.inputDetails();
        ob.showDetails();
        System.out.println("Score1 is "+Sports.score1);
        System.out.println("Score2 is "+Sports.score2);
        System.out.println("Total Marks: "+(ob.mark1+ob.mark2));
        System.out.println("Total Score: "+(Sports.score1+Sports.score2));
    }
}