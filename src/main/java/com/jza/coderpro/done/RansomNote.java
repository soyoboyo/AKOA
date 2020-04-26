package com.jza.coderpro.done;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	/*
		Given an arbitary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines; otherwise, it will return false.

		Each letter in the magazine string can only be used once in your ransom note.
	 */

	public static boolean canConstructOfficialAnswer(String note, String magazine) {
		Map<Character, Integer> magazineLettersCount = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			addLetter(magazineLettersCount, magazine.charAt(i));
		}

		for (int i = 0; i < note.length(); i++) {
			Character c = note.charAt(i);
			if (magazineLettersCount.get(c) == null || magazineLettersCount.get(c) < 0) {
				return false;
			} else {
				magazineLettersCount.put(c, magazineLettersCount.get(c) - 1);
			}
		}
		return true;
	}


	public static boolean canMakeRansomNote(String note, String magazine) {
		Map<Character, Integer> magazineMap = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			addLetter(magazineMap, magazine.charAt(i));
		}
		Map<Character, Integer> noteMap = new HashMap<>();
		for (int i = 0; i < note.length(); i++) {
			addLetter(noteMap, note.charAt(i));
		}
		for (Map.Entry<Character, Integer> pair : noteMap.entrySet()) {
			if (magazineMap.get(pair.getKey()) == null || pair.getValue() > magazineMap.get(pair.getKey())) {
				return false;
			}
		}
		return true;
	}

	private static void addLetter(Map<Character, Integer> map, Character letter) {
		if (map.containsKey(letter)) {
			map.put(letter, map.get(letter) + 1);
		} else {
			map.put(letter, 1);
		}
	}

}
