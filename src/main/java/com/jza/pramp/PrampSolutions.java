package com.jza.pramp;

public class PrampSolutions {


	static double root(double x, int n) {
		double mid = x / 2;
		double left = 0.0;
		double right = x;
		while (left < right) {
			double power = Math.pow(mid, n);
			if (Math.abs(x - power) < 0.001) {
				return mid;
			} else if (power > x) {
				right = mid;
			} else if (power < x) {
				left = mid;
			}
			mid = (left + right) / 2;
		}
		return mid;


	}

	static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
		int i = 0, j = 0;
		while (i < slotsA.length && j < slotsB.length) {
			int laterStart = Math.max(slotsA[i][0], slotsB[j][0]);
			int earlierEnd = Math.min(slotsA[i][1], slotsB[j][1]);
			int difference = earlierEnd - laterStart;
			if (dur <= difference) {
				return new int[]{laterStart, laterStart + dur};
			}
			if (slotsA[i][1] < slotsB[j][1]) {
				i++;
			} else {
				j++;
			}
		}
		return new int[]{};
	}


	static int[] arrayOfArrayProducts(int[] arr) {
		int len = arr.length;
		if (len < 1) {
			return arr;
		} else if (len == 1) {
			return new int[]{};
		}
		int[] left = new int[len];
		int[] right = new int[len];

		left[0] = 1;
		for (int i = 1; i < len; i++) {
			left[i] = arr[i - 1] * left[i - 1];
		}

		right[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--) {
			right[i] = arr[i + 1] * right[i + 1];
		}


		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = left[i] * right[i];
		}


		return result;
	}

}
