package com.jza.dip.facebook;

public class MoveZeroes {
	public static int[] sort(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index] = nums[i];
				nums[i] = 0;
				index++;
			}
		}
		return nums;
	}
}
