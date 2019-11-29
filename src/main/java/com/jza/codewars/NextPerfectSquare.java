package com.jza.codewars;

public class NextPerfectSquare {
	public static long findNextSquare(long sq) {
		if (Math.sqrt(sq) != Math.floor(Math.sqrt(sq))) {
			return -1;
		}
		sq++;
		while (true) {
			if (Math.sqrt(sq) == Math.floor(Math.sqrt(sq))) {
				break;
			} else {
				sq++;
			}
		}
		return sq;
	}
}
