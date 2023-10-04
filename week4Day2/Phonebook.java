package com.takeo.week4Day2;

import java.util.HashMap;

public class Phonebook {

	private HashMap<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void addEntry(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public String searchForEntry(String name) {
        return phonebook.get(name);
    }

    public void removeEntry(String name) {
        phonebook.remove(name);
    }

    public void printPhonebook() {
        for (String name : phonebook.keySet()) {
            System.out.println(name + ": " + phonebook.get(name));
        }
    }

    

}
