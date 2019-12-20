package com.jza.codewars.kyu7;

import java.util.TreeSet;

public class TwoToOne {
	public static String longest(String s1, String s2) {
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		TreeSet<Character> letters = new TreeSet<>();
		for (char c : a1) {
			letters.add(c);
		}
		for (char c : a2) {
			letters.add(c);
		}
		StringBuilder s = new StringBuilder();
		for (Character c : letters) {
			s.append(c);
		}
		return s.toString();
	}
}
