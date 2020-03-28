package com.jza.tdg.fop;

public class RightInTwo {

	public static boolean CanDivideRightInTwo(int[] nums) {
		int i = 0, j = nums.length - 1;
		int leftSum = nums[i], rightSum = nums[j];
		while (i != j - 1) {
			if (i == j && leftSum == rightSum) {
				return false;
			}
			if (leftSum == rightSum) {
				i++;
				j--;
				leftSum += nums[i];
				rightSum += nums[j];
			} else if (leftSum > rightSum) {
				j--;
				rightSum += nums[j];
			} else if (leftSum < rightSum) {
				i++;
				leftSum += nums[i];
			}
		}
		return leftSum == rightSum;
	}
}
