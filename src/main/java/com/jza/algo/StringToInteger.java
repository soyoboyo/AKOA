package com.jza.algo;

public class StringToInteger {

	public static Integer convert(String s) {
		int result = 0;
		int digit = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				result += (c - '0') * Math.pow(10, digit);
				digit++;
			} else {
				return null;
			}
		}

		return result;
	}
}
