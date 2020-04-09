package com.jza.leet.aprilchallange.week2;

class BackspaceStrings {
	public static boolean backspaceCompare(String S, String T) {
		StringBuilder sb = new StringBuilder();
		int removeCount = 0;
		for (int i = S.length() - 1; i >= 0; i--) {
			Character c = S.charAt(i);
			if (c == '#') {
				removeCount++;
			} else {
				if (removeCount == 0) {
					sb.append(c);
				} else {
					removeCount--;
				}
			}
		}
		String sClean = sb.reverse().toString();
		sb.setLength(0);
		removeCount = 0;
		for (int i = T.length() - 1; i >= 0; i--) {
			Character c = T.charAt(i);
			if (c == '#') {
				removeCount++;
			} else {
				if (removeCount == 0) {
					sb.append(c);
				} else {
					removeCount--;
				}
			}
		}
		String tClean = sb.reverse().toString();
		return sClean.equals(tClean);
	}
}
