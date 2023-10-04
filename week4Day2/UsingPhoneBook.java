package com.takeo.week4Day2;

import java.util.Scanner;

public class UsingPhoneBook {
	public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Add an entry");
            System.out.println("2. Search for an entry");
            System.out.println("3. Remove an entry");
            System.out.println("4. Print the phonebook");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addEntry(name, phoneNumber);
                    break;
                case 2:
                    System.out.println("Enter the name to search for: ");
                    name = scanner.nextLine();
                    phoneNumber = phonebook.searchForEntry(name);
                    if (phoneNumber != null) {
                        System.out.println("Phone number for " + name + ": " + phoneNumber);
                    } else {
                        System.out.println("Entry for " + name + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the name to remove: ");
                    name = scanner.nextLine();
                    phonebook.removeEntry(name);
                    break;
                case 4:
                    phonebook.printPhonebook();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

}
