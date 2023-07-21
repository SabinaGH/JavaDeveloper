package Day2Challange;
/*Exercise 2: Currency Converter
Scenario: You are developing a currency converter application, and you need to implement a feature that converts a
given amount in one currency to another currency.

Given : USD value = 10

Task: Write a program that converts currency to another currency based on the exchange rate. The exchange rate
should be stored as a constant variable. Print the converted amount.
//you can convert USD-Rupees and use proper data type*/

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);

        System.out.println("Enter USD amount : ");
        double  usdValue = userEntry.nextDouble();

        final double nepaliRupeeExchangeRate = 131.37572;
        double nepaliRupee = 0;

        double convertedNepaliRupee =0;

        convertedNepaliRupee = usdValue*nepaliRupeeExchangeRate;

        System.out.println(("$"+usdValue+ " USD = Rs. "+convertedNepaliRupee+" Nepali Rupees"));


        userEntry.close();
    }
}
