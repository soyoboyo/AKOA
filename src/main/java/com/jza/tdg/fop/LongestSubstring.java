package com.jza.tdg.fop;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LongestSubstring {

	public static String solution(String string, String[] dict) {
		String result = "";
		Map<Character, List<Integer>> stringMap = getIndexesMap(string);
		for (String substring : dict) {
			StringBuilder sb = new StringBuilder();
//			int subIndex = 0;
//			for (int i = 0; i < string.length() && subIndex < substring.length(); i++) {
//				if (string.charAt(i) == substring.charAt(subIndex)) {
//					sb.append(substring.charAt(subIndex));
//					subIndex++;
//				}
//			}
			int lastMatchedIndex = 0;
			for (int i = 0; i < substring.length(); i++) {
				Character c = substring.charAt(i);
				if (stringMap.get(c) != null && stringMap.get(c).get(0) <= lastMatchedIndex) {
					sb.append(c);
					lastMatchedIndex++;
				}
			}
			System.out.println(sb.toString());
			if (substring.equals(sb.toString()) && result.length() < substring.length()) {
				result = sb.toString();
			}
		}
		return result;
	}


	private static Map<Character, List<Integer>> getIndexesMap(String s) {
		Map<Character, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (map.get(c) != null) {
				List<Integer> indexes = new LinkedList<>(map.get(c));
				indexes.add(i);
				map.put(c, indexes);
			} else {
				List<Integer> indexes = new LinkedList<>();
				indexes.add(i);
				map.put(c, indexes);
			}
		}
		System.out.println(map);
		return map;
	}
}
