package com.jza.dip.apple;

public class ShiftedStrings {

	public static boolean isShifted(String a, String b) {
		int len = a.length();
		if (len != b.length()) {
			return false;
		}
		for (int i = 0; i < len; i++) {
//			if all(a[(i + j) % len(a)] == b[j]
//			for j in range(len(a))):
//			return True
		}
		return (a + a).contains(b);
	}
}
