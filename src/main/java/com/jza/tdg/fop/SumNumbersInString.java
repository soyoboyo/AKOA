package com.jza.tdg.fop;

public class SumNumbersInString {

	public static int sumNumbers(String str) {
		int sum = 0;
		String tempSum = "";
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (Character.isDigit(c)) {
				tempSum += c.toString();
			} else if (tempSum.length() > 0) {
				sum += Integer.parseInt(tempSum);
				tempSum = "";
			}
		}
		if (tempSum.length() > 0) {
			sum += Integer.parseInt(tempSum);
		}
		return sum;
	}
}
