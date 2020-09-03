package com.jza.challengerocket;

public class ChallengeRocketOriginal {

	// https://challengerocket.com/smaller-number-with-the-same-d
	// Write a code that receives a positive integer number and returns the next smaller positive integer number formed from the same digits. Return -1 if that's impossible.
	public static int smallerNumberWithSameDigits(int num) {
		char[] digits = String.valueOf(num).toCharArray();

		int res = Integer.parseInt(String.valueOf(digits));
		System.out.println("res = " + res);
		if (res >= num) {
			for (int i = digits.length - 1; i >= 1; i--) {
				char tmp = digits[i];
				digits[i] = digits[i - 1];
				digits[i - 1] = tmp;
				if (Integer.parseInt(String.valueOf(digits)) < num) {
					return Integer.parseInt(String.valueOf(digits));
				}
			}
		} else {
			return res;
		}
		return -1;
	}


}
