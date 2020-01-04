package com.jza.algo;

import java.util.HashMap;
import java.util.Map;

public class NonDuplicate {

	/*

	 */
	public static int findUnique(int[] nums) {
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (count.get(num) == null) {
				count.put(num, 1);
			} else {
				count.put(num, count.get(num + 1));
			}
		}

		for (Map.Entry<Integer, Integer> pair : count.entrySet()) {
			if (pair.getValue() == 1) {
				return pair.getKey();
			}
		}
		return 0;
	}

	public static int findUniqueXOR(int[] nums) {
		int unique = 0;
		for (int i = 0; i < nums.length; i++) {
			unique ^= nums[i];
		}
		return unique;
	}

}
