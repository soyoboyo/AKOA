package com.jza.challenges.y2021;

public class TheMatrix {

	public static int solution(int[] A) {
		int max = 1;
		int len = A.length;
		if (len == 1) {
			return 1;
		}
		for (int i = 0; i < len - 1; i++) {
			int limit = A[i];
			int currSize = 1;
			if (A[i] <= max) {
				continue;
			}
			for (int j = i + 1; j < len; j++) {
				limit = Math.min(A[j], limit);
				currSize++;
				if (currSize <= limit) {
					max = Math.max(currSize, max);
				} else {
					break;
				}
			}
		}
		return max;
	}
}
