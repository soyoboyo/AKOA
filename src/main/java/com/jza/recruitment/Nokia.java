package com.jza.recruitment;

public class Nokia {

	public static int linkedList(int[] A){
		int i = 0, length = 1;
		int start = 0;
		int again = 0;
		boolean	cantFind = false;
		for(int j = 0; i < A.length; j++){
			if (A[j] == -1) {
				start = j;
				break;
			}
		}
		i = start;

		while(!cantFind){
			for (int k = 0; k < A.length; k++) {
				if (A[k] == i) {
					length++;
					i = k;
					again = 0;
					break;
				}
				again++;
			}
			if (again > 1 || length == A.length) {
				return length;
			}
		}
		return length;
	}


	public static boolean oneSwap(int[] A){
		int lessThanPrevious = 0;
		int blue = 0;
		int blueValue = Integer.MAX_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i + 1] < A[i]) {
				blue = i;
				blueValue = A[i];
				lessThanPrevious++;
				for (int j = i+1; j < A.length; j++) {
					if (A[i] > A[j] && A[i+1] < A[j]) {
						return false;
					}
				}
			}
			if (blueValue <= A[i + 1] && A[blue + 1] >= A[i] ) {
				A[blue] = A[i];
				A[i] = blueValue;
				return true;
			}
		}
		if (lessThanPrevious >= 2) {
			return false;
		} else
			return true;

	}

}
