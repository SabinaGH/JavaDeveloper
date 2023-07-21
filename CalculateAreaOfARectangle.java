package Day2Challange;

import java.util.Scanner;

/*


Exercise 5: Calculate Area of a Rectangle
Scenario: You are designing a floor planning tool, and you need to calculate the area of a rectangle-shaped room.
Given : Take length as 20 and breadth as 40.
Task: Write a program that will calculates rectangle area. Print the calculated area.
 */
public class CalculateAreaOfARectangle {

    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);

        System.out.println("Enter length: ");
        double  length = userEntry.nextDouble();

        System.out.println("Enter length: ");
        double  width = userEntry.nextDouble();

        double area = 0;

        area = length*width;

        System.out.println("Area of rectangle is "+area);

        userEntry.close();


    }
}
