package com.jza.algo.done;

public class StringToInteger {

	public static Integer convert(String s) {
		int result = 0;
		int digit = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				result += (c - '0') * Math.pow(10, digit);
				digit++;
			} else if (i == 0 && c == '-') {
				result *= -1;
			} else {
				return null;
			}
		}

		return result;
	}

	public static Integer convertOfficial(String s) {
		boolean isNegative = s.charAt(0) == '-';
		int result = 0;
		if (s.isEmpty()) {
			return null;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				result *= 10;
				result += c - '0';
			} else if (!isNegative && i != 0) {
				return null;
			}
		}
		if (isNegative)
			result *= 1;
		return result;
	}
}
