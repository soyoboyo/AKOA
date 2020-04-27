package com.jza.dip.facebook;

import java.util.Arrays;

class JumpToEnd {

 	/*
		Starting at index 0, for an element n at index i, you are allowed to jump at most n indexes ahead. Given a list of numbers, find the minimum number of jumps to reach the end of the list.
	  The minimum number of jumps to get to the end of the list is 2:
		3 -> 5 -> 4


		---------------------------------

		Using a dynamic programming approach, we can get the minimum number of jumps to the end of the list.

		For every number, iterate through the current index+i where, i are all numbers from 1 to the current number. Update the minimum of the jump number at index+i, where the min jump can be already its number or the current jump number + 1.

		Remember to break if it's out of range, as the numbers can be very large!

		The time complexity of this solution is O(n2), since the jump number can be n. The space complexity is O(n) in order to store the minimum jump to each index.
 	 */

	public static int getJumps(int nums[]) {
		int len = nums.length;
		int[] jumps = new int[len];
		Arrays.fill(jumps, Integer.MAX_VALUE);
		jumps[0] = 0;

		int iter = 0;
		for (int i = 0; i < len; i++) {
			int n = nums[i];
			for (int j = 1; j < n + 1; j++) {
				iter++;
				if ((i + j) < len) {
					jumps[i + j] = Math.min(jumps[i + j], jumps[i] + 1);
				} else {
					break;
				}
			}

		}
		System.out.println(iter);
		System.out.println(Arrays.toString(jumps));
		return jumps[len - 1];
	}

}
