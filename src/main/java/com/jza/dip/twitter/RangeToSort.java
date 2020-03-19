package com.jza.dip.twitter;

class RangeToSort {


	public static int[] getRange(int[] arr) {
		int[] range = new int[2];
		int length = arr.length;

		int start = 0, end = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = length - 1; i > 0; i--) {
			min = Math.min(arr[i], min);
			if (arr[i] > min) {
				start = i;
			}
		}
		for (int i = 0; i < length; i++) {
			max = Math.max(arr[i], max);
			if (arr[i] < max) {
				end = i;
			}
		}

		range[0] = start;
		range[1] = end;
		return range;
	}


}
