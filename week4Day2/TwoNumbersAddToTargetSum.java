package com.takeo.week4Day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TwoNumbersAddToTargetSum {

	 

	public static int[] findTwoSum(int[] nums, int target) {
        // Create a hash table to store the elements of the list.
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate over the list.
        for (int i = 0; i < nums.length; i++) {
            // Get the complement of the current element.
            int a = target - nums[i];

            // If the complement is in the hash table, then we have found a pair of numbers that add up to the target sum.
            if (map.containsKey(a)) {
                return new int[]{nums[i], map.get(a)};
            }

            // Add the current element to the hash table.
            map.put(nums[i], i);
        }

        // If we reach here, then there is no pair of numbers in the list that add up to the target sum.
        return null;
    }
		    public static void main(String[] args) {
		        int[] nums = {10, 7, 3, 4};
		        int target = 13;

		        int[] result = findTwoSum(nums, target);

		        if (result != null) {
		            System.out.println("The two numbers that add up to " + target + " are " + result[0] + " and " + result[1] + ".");
		        } else {
		            System.out.println("No two numbers in the list add up to " + target + ".");
		        }
		    }

	 

}
