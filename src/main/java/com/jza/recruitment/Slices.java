package com.jza.recruitment;

public class Slices {

	public static int solution(int[] A) {
		int slices = 0;

		for (int i = 0; i < A.length - 2; i++) {
			int diff = Math.abs(A[i + 1] - A[i]);
			int prev = A[i + 2];

			if (diff == Math.abs(A[i + 2] - A[i + 1])) {
				slices++;
				for (int j = i + 3; j < A.length; j++) {
					if (Math.abs(A[j] - prev) == diff) {
						slices++;
						prev = A[j];
					} else
						break;
				}
			}
		}

		return slices;
	}

}
