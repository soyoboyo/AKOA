package com.jza.leet.aprilchallange.week4;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumToK {
	public static int getSubarraysCount(int[] nums, int k) {
		if (nums.length == 0) {
			return 0;
		}
		Map<Integer, Integer> sums = new HashMap<>();
		int sum = 0;
		int result = 0;
		sums.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sums.containsKey(sum - k)) {
				result += sums.get(sum - k);
			}
			sums.put(sum, sums.getOrDefault(sum, 0) + 1);
		}
		return result;
	}
}
