package com.jza.recruitment.nokia;

public class RemoveSort {

	public static int solution(String S) {
		int removes = 0;
		for (int i = 0; i < S.length() - 1; i++) {
			if (S.charAt(i) > S.charAt(i + 1)) {
				removes++;
			}
		}
		return removes;
	}

}
