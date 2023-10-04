package com.takeo.week4Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListOfDistinctIntegers {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(5);

        // Create a set to remove duplicate values
        Set<Integer> set = new LinkedHashSet<>(list);

        // Print the set
        System.out.println(set);

	}

}
