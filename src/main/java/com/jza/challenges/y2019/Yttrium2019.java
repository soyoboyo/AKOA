package com.jza.challenges.y2019;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Yttrium2019 {

	static int removingSegment(String s, int K) {
		Character first = s.charAt(0);

		Map<Character, Integer> letters = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			putChar(letters, s.charAt(i));
		}
		if (letters.size() < K) {
			return -1;
		} else return 0;
	}

	public static void putChar(Map<Character, Integer> letters, Character c){
		if(letters.get(c) == null){
			letters.put(c, 1);
		} else {
			Integer old = letters.get(c);
			letters.put(c, old + 1);
		}
	}
}
