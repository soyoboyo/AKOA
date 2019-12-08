package com.jza.codewars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
	public static int duplicateCount(String text) {
		Map<Character, Integer> chars = new HashMap<>();
		int counter = 0;
		String caseInsensitive = text.toLowerCase();
		for (int i = 0; i < caseInsensitive.length(); i++) {
			Character c = caseInsensitive.charAt(i);
			if (chars.get(c) == null) {
				chars.put(c, 1);
			} else if (chars.get(c) == 1) {
				counter++;
				chars.put(c, 2);
			}

		}
		return counter;
	}
}
