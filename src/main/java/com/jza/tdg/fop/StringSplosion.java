package com.jza.tdg.fop;

public class StringSplosion {
	public static String stringSplosion(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < i + 1; j++) {
				sb.append(str.charAt(j));
			}
		}
		return sb.toString();
	}

}
