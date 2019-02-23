package com.jza;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		if ("aaa" == new String("aaa")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static int binaryGap(int N) {
		int gap = 0;
		int tmpGap = 0;

		String binStr = Integer.toBinaryString(N);

		for (int i = 0; i < binStr.length(); i++) {
			if (binStr.charAt(i) == 1) {
				System.out.println("gap start: " + i);

			}
		}

		return 0;
	}

	// https://codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
	public static int strangerNumber(int[] A) {

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}

		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] != A[i]) {
				return A[i - 1];
			} else {
				i++;
			}
		}
		return 0;
	}

	private static int[] rotateArray(int[] A, int K) {

		int last = A.length - 1;
		int tmp = A[last];

		for (int j = 0; j < K; j++) {
			for (int i = last; i > 0; i--) {
				A[i] = A[i - 1];
			}
			A[0] = tmp;
			tmp = A[last];
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "] = " + A[i]);
		}

		return A;
	}
}
