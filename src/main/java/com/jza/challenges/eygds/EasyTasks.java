package com.jza.challenges.eygds;

import java.util.Arrays;

public class EasyTasks {

	/*
		You have N operational conveyor belts working simultaneously, that will be assigned to tasks with various time of completion.
		Your task is to find minimum time needed for those tasks to be completed in the most efficient way.
		N - number of conveyor belts
		arr[int] - array of units of time to complete task

		Example:
		int[] arr = {2, 1, 3, 2, 3, 1};
		N = 3;
		expected: 4

		Example optimal assigment for this input is as follow:
		First belt will be assigned tasks with completion times 1 and 3
		Second belt: 2, 2
		Third belt: 3, 1

		Which give totla completion time of 4 units.
	 */

	public static int organizeWork(int N, int arr[]) {
		return 0;
	}

	public static int rearrange(int n) {
		char[] digits = String.valueOf(n).toCharArray();
		Arrays.sort(digits);
		StringBuilder result = new StringBuilder();
		for (int i = digits.length - 1; i >= 0; i--) {
			result.append(digits[i]);
		}
		return Integer.parseInt(result.toString());
	}

	public static boolean isEgoistic(String number) {
		int last = Character.getNumericValue(number.charAt(number.length() - 1));
		String sqr = String.valueOf(last * last);
		return Character.getNumericValue(sqr.charAt(sqr.length() - 1)) == last;
	}

}
