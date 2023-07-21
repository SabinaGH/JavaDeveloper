package Day2Challange;

/*
Exercise 3: Total Bill Calculation
Scenario: You are developing a restaurant bill calculation application. You need to implement a feature that calculates the total bill amount, including tax and tip.
Given : Bill amount = 30, Taxes = 15, Tip  = 10
Task: Write a program that calculates the total bill amount by adding the bill amount, tax and tip.

*/

public class TotalBillCalculation {

    public static void main(String[] args) {

        float billAmount = 30;
        float taxes = 15;
        float tip = 10;

        float totalBillAmount = 0;

        totalBillAmount = (billAmount + taxes + tip )  ;

        System.out.println("Total Bill Amount is " + totalBillAmount);
    }
}
