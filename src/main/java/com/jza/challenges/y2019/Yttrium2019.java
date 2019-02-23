package com.jza.challenges.y2019;

import java.util.HashSet;
import java.util.Set;

public class Yttrium2019 {

	static int removingSegment(String s, int K) {
		Character first = s.charAt(0);

		if (verifyK(s, K)) {
			return 0;
		} else {
			return -1;
		}
	}

	private static Boolean verifyK(String s, int K) {
		Set<Character> letters = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			letters.add(s.charAt(i));
		}
		if (letters.size() < K) {
			return false;
		} else return true;
	}
}
