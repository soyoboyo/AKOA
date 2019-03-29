package com.jza.lessons;

import java.util.Arrays;

public class DemoTask {

	public static int findSmall(int[] A) {

		Arrays.sort(A);

		int min = 1;
		boolean inArray = false;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] + 1 != A[i + 1] && A[i] > 0) {
				min = A[i] + 1;
				inArray = true;
			}
		}

		if (inArray == false && A[A.length - 1] > 0) {
			min = A[A.length - 1] + 1;
		}
		return min;
	}

}
