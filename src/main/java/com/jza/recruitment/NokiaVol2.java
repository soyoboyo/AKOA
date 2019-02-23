package com.jza.recruitment;

import java.util.Arrays;

public class NokiaVol2 {

	public static int linkedList(int[] A) {
		int length = 1, index = 0;
		int value = A[0];
		while (value != -1) {
			index = value;
			if (value != -1) {
				value = A[index];
				length++;
			}
		}

		return length;
	}


	public static boolean oneSwap(int[] A) {

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
