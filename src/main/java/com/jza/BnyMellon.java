package com.jza;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BnyMellon {

	public static void main(String[] args) {
		System.out.println(shortestSubstring("aabcce"));
	}

	public static int shortestSubstring(String givenString) {
		// Write your code here

		Map<Character, Integer> charCount = new HashMap<>();
		int uniqueCharCount = givenString.chars()
				.mapToObj(e -> (char) e)
				.collect(Collectors.toSet())
				.size();

		int min = givenString.length();
		int start = 0;

		for (int i = 0; i < givenString.length(); i++) {
			char c = givenString.charAt(i);
			charCount.merge(c, 1, Integer::sum);
			int substringCount = charCount.values().stream().reduce(0, Integer::sum);
			if (charCount.size() == uniqueCharCount && substringCount >= uniqueCharCount) {
				min = Math.min(min, substringCount);
			} else {
				while (charCount.size() > uniqueCharCount) {
					charCount.merge(givenString.charAt(start), -1, Integer::sum);
					if (charCount.get(givenString.charAt(start)) < 1) {
						charCount.remove(givenString.charAt(start));
					}
					start++;
					if (charCount.size() == uniqueCharCount && substringCount == uniqueCharCount) {
						min = Math.min(min, substringCount);
					}
				}

			}
		}

		return min;
	}

}
