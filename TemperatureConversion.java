package Day2Challange;

import java.util.Scanner;

/*
  Exercise 1: Temperature Conversion
    Scenario: You are building a weather application, and you need to implement a feature that converts temperature values from Celsius to Fahrenheit.
    Given : You can take temperature of your city in Celsisus.
    Task: Write a program that converts Celsisus to Fahrenheit using the formula (Celsius * 9/5) + 32, and prints the converted temperature.
    // use proper data type for this as we can have decimal value there.
* */
public class TemperatureConversion {

    public static void main(String[] args) {
        float tempInCelcius = 0;
        float tempInFahrenheit = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temparature in Celcius: ");
        tempInCelcius = scanner.nextFloat();

        tempInFahrenheit = (tempInCelcius * 9 / 5) + 32;
        System.out.println("Temparature in Fahrenheit is " + tempInFahrenheit);

        scanner.close();
    }


}
