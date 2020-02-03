package com.jza.algo.done;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
	/*
	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	You may assume that each input would have exacly one solution, and you may not use the same element twice.
	 */

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

	public static int[] twoSumOfficialAnswer(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			int num = target - nums[i];
			if (map.get(num) != null) {
				return new int[]{map.get(num), i};
			}
		}
		return null;
	}
}
