package com.jza.tdg.fop;

import java.util.HashMap;
import java.util.Map;

public class MaxSpan {

	public static int getMaxSpan(int[] nums) {
		int maxSpan = 0;
		int len = nums.length;
		Map<Integer, Integer> firstOccurrence = new HashMap<>();
		Map<Integer, Integer> lastOccurrence = new HashMap<>();
		for (int i = 0, j = nums.length - 1; i < len; i++, j--) {
			int left = nums[i];
			int right = nums[j];
			firstOccurrence.putIfAbsent(left, i);
			lastOccurrence.putIfAbsent(right, j);
			if (firstOccurrence.get(right) != null) {
				maxSpan = Math.max(maxSpan, j - firstOccurrence.get(right) + 1);
			}
			if (lastOccurrence.get(left) != null) {
				maxSpan = Math.max(maxSpan, lastOccurrence.get(left) - i + 1);
			}

		}
		return maxSpan;
	}
}
