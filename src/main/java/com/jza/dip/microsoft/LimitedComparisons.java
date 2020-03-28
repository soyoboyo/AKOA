package com.jza.dip.microsoft;

public class LimitedComparisons {

	/*
		Hi, here's your problem today. This problem was recently asked by Microsoft:
		Given a list of numbers of size n, where n is greater than 3, find the maximum and minimum of the list using less than 2 * (n - 1) comparisons.
	 */

	/*
	Using a for loop and comparing between every value will result in 2 * (n - 1) comparisons, so we need to do better than that.

	When comparing against every number, there needs to be 2 comparisons, one for the max and one for the min. However if the numbers are grouped by 2, we can reduce the number of comparisons. If 2 numbers are first compared, where one is smaller and one is larger, the smaller number can be compared against the current min, and the larger number number can be compared against the current max. Therefore for every 2 numbers the comparisons is reduced from 4 to 3.

	Using this, the number of comparisons done should be in the order of 3 * (n / 2), which should be larger than 2 * (n - 1).

----------------------------------------------

	With the solution, the exact number of comparisons given n is 1 + 3 * n/2, which is less than 2 * (n - 1).

	The time complexity of the solution is O(n) to iterate through every number, and the space complexity is O(1) with only the use of a constant number of variables.
	 */

	public static int[] findMinAndMax(int[] nums) {
		int len = nums.length;
		int min = 0, max = 0;
		if (len % 2 == 1) {
			min = max = nums[len];
		} else {
			min = max = nums[0];
		}

		for (int i = 0; i < len / 2; i++) {
			int minA, maxA;
			int left = nums[2 * i], right = nums[2 * i + 1];
			if (left < right) {
				minA = left;
				maxA = right;
			} else {
				minA = right;
				maxA = left;
			}
			min = Math.min(min, minA);
			max = Math.max(max, maxA);
		}
		return new int[]{min, max};
	}
}
