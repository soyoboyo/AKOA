package com.jza.recruitment.amazon;

public class GCDforN {

	public static int getGDC(int[] numbers, int length) {
		int gcd = 1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		for (int i = gcd; i <= min; i++) {
			boolean allCanBeDivided = true;
			for (int j = 0; j < length; j++) {
				if (numbers[j] % i != 0) {
					allCanBeDivided = false;
					break;
				}
			}
			if (allCanBeDivided) {
				gcd = i;
			} else {
				break;
			}
		}
		return gcd;
	}

}
