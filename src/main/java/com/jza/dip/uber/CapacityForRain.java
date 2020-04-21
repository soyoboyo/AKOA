package com.jza.dip.uber;

class CapacityForRain {
	public static int getCapacity(int[] landscape) {
		int len = landscape.length;
		if (len < 2) {
			return 0;
		}
		int[] rightMax = new int[len];
		int max = landscape[len - 1];
		for (int i = len - 1; i >= 0; i--) {
			int n = landscape[i];
			if (n > max) {
				max = n;
			}
			rightMax[i] = max;
		}
		max = landscape[0];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int n = landscape[i];
			if (n > max) {
				max = n;
			}
			int min = Math.min(max, rightMax[i]);
			if (n < min) {
				sum += min - n;
			}
		}


		return sum;
	}


}
