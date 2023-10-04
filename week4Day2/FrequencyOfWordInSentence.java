package com.takeo.week4Day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWordInSentence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");
        
       // for (String a : words) {
      // System.out.println(a);

       // }
        // Create a map to store the frequency of each word
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Iterate over the words and update the frequency map
        for (String word : words) {
            if (wordFrequencyMap.containsKey(word)) {
                int frequency = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, frequency + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }

        // Print the frequency of each word
        for (String word : wordFrequencyMap.keySet()) {
            int frequency = wordFrequencyMap.get(word);
            System.out.println(word + ": " + frequency);
        }

	}

}
