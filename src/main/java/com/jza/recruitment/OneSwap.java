package com.jza.recruitment;

import java.util.Arrays;

public class OneSwap {

	public static boolean solution(int[] A) {

		int swapped = 0;
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				swapped++;
			}
		}

		if (swapped > 2) {
			return false;
		} else return true;
	}
}
