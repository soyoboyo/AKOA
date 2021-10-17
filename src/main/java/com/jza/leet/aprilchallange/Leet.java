package com.jza.leet.aprilchallange;

import java.util.HashMap;
import java.util.Map;

public class Leet {

	public static void main(String[] args) {
		int[] nums = {3, 2, 3};
		majorityElement(nums);
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int n : nums) {
			count.merge(n, 1, Integer::sum);
		}
		for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
			if (entry.getValue() > nums.length / 2) {
				return entry.getKey();
			}
		}
		return 0;
	}

// cbabcacabca
// cba -> abc () -> tak
// bab -> abc -> () -> nie
// abc -> abc -> () tak
// bca -> abc -> () tak

}
