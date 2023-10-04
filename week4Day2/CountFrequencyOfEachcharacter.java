package com.takeo.week4Day2;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachcharacter {
	
	 public static Map<Character, Integer> countCharacterFrequency(String str) {
	        Map<Character, Integer> map = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            if (!map.containsKey(c)) {
	                map.put(c, 1);
	            } else {
	                map.put(c, map.get(c) + 1);
	            }
	        }
	        return map;
	    }

	    public static void main(String[] args) {
	        String str = "Sabina Ghalan";

	        Map<Character, Integer> map = countCharacterFrequency(str);

	        for (char c : map.keySet()) {
	            System.out.println("Character: " + c + ", Frequency: " + map.get(c));
	        }
	    }

}
