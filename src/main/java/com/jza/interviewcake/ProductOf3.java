package com.jza.interviewcake;

class ProductOf3 {
	public static int getHighestProduct(int[] nums) {
		int first = nums[0], second = nums[1];

		// we're going to start at the 3rd item (at index 2)
		// so pre-populate highests and lowests based on the first 2 items.
		// we could also start these as null and check below if they're set
		// but this is arguably cleaner
		int highest = Math.max(first, second);
		int lowest = Math.min(first, second);
		int highestProductOf2 = first * second;
		int lowestProductOf2 = first * second;

		// except this one--we pre-populate it for the first *3* items.
		// this means in our first pass it'll check against itself, which is fine.
		int highestProductOf3 = first * second * nums[2];

		// walk through items, starting at index 2
		for (int i = 2; i < nums.length; i++) {
			int n = nums[i];
			// do we have a new highest product of 3?
			// it's either the current highest,
			// or the current times the highest product of two
			// or the current times the lowest product of two
			highestProductOf3 = Math.max(Math.max(
					highestProductOf3,
					n * highestProductOf2),
					n * lowestProductOf2);

			// do we have a new highest product of two?
			highestProductOf2 = Math.min(Math.min(
					highestProductOf2,
					n * highest),
					n * lowest);

			// do we have a new highest?
			highest = Math.max(highest, n);

			// do we have a new lowest?
			lowest = Math.min(lowest, n);

		}
		return highestProductOf3;


		/*
		n log(n) - too slow
		Arrays.sort(nums);
		int len = nums.length;
		int twoNegative = nums[0] * nums[1] * nums[len - 1];
		int threePositive = nums[len - 1] * nums[len - 2] * nums[len - 3];
		return Math.max(twoNegative, threePositive);
		 */
	}
}
