package com.jza.codewars;

public class Mumbling {
	public static String accum(String s) {
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			Character first = Character.toUpperCase(chars[i]);
			sb.append(first);
			for (int j = 0; j < i; j++) {
				sb.append(Character.toLowerCase(chars[i]));
			}
			if (i != chars.length - 1) {
				sb.append("-");
			}
		}
		return sb.toString();
	}
}
