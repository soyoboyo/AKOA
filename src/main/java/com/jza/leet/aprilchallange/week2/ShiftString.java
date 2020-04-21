package com.jza.leet.aprilchallange.week2;

public class ShiftString {
	public static String stringShift(String s, int[][] shift) {
		int shif = 0, len = s.length();
		for (int i = 0; i < shift.length; i++) {
			int[] x = shift[i];
			if (x[0] == 0) {
				shif -= x[1];
			} else {
				shif += x[1];
			}
		}
		if (Math.abs(shif) > len) {
			shif = shif % len;
		}
		if (shif == 0) {
			return s;
		} else if (shif > 0) {
			return s.substring(len - shif) + s.substring(0, len - shif);
		} else {
			return s.substring(Math.abs(shif)) + s.substring(0, Math.abs(shif));
		}
	}
}
