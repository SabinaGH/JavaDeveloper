package Day3Challange;

/*
Exercise 6: Design a calulator which perform a set of operations dynamically.
Scenario: Design a Calculator class. Take inpit from user like :
          Enter first number = 5
          Enter Second number = 5
          Enter Operation you want to perform = +

Outupt of Program will be like this :

          Output: 5+5 = 10;

Hint :   take input by using Scanner class
         take operation(+,-,*,/) as String input from the console
         use if else cases to compare operation with constant String like : final String SUM = "+"; similar for other
         then inside if do the required operation
         print the output.
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();


        double calculatedValue = 0.00;
        boolean validOperationValue = true;

        do {

            System.out.println("Enter Operation you want to perform (pick one of these (+,-,*,/)) = ");
            String operationValue = scanner.next();

            if (operationValue.contains("+")) {
                calculatedValue = firstNumber + secondNumber;
                System.out.println("Output: " + firstNumber + operationValue + secondNumber + " = " + calculatedValue);
                validOperationValue = true;

            } else if (operationValue.contains("-")) {
                calculatedValue = firstNumber - secondNumber;
                System.out.println("Output: " + firstNumber + operationValue + secondNumber + " = " + calculatedValue);

                validOperationValue = true;
            } else if (operationValue.contains("*")) {
                calculatedValue = firstNumber * secondNumber;
                System.out.println("Output: " + firstNumber + operationValue + secondNumber + " = " + calculatedValue);

                validOperationValue = true;

            } else if (operationValue.contains("/")) {
                calculatedValue = firstNumber / secondNumber;
                System.out.println("Output: " + firstNumber + operationValue + secondNumber + " = " + calculatedValue);
                validOperationValue = true;

            } else {

                System.out.println("Please enter valid operation  (pick one of these (+,-,*,/))  ");

                validOperationValue = false;
                System.out.println(validOperationValue);
            }
        } while (validOperationValue != true);

        scanner.close();
    }
}
