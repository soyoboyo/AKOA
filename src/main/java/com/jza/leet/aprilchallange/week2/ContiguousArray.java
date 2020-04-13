package com.jza.leet.aprilchallange.week2;

import java.util.HashMap;
import java.util.Map;

class ContiguousArray {
	public static int findMaxLength(int[] nums) {
		int count = 0, max = 0;
		Map<Integer, Integer> counts = new HashMap<>();
		counts.put(0, -1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count--;
			} else {
				count++;
			}
			if (counts.containsKey(count)) {
				max = Math.max(max, i - counts.get(count));
			} else {
				counts.put(count, i);
			}
			System.out.println(counts);
		}
		return max;
	}
}
