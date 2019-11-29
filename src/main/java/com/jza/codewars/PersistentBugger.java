package com.jza.codewars;

import java.util.ArrayList;
import java.util.List;

public class PersistentBugger {

	public static int persistence(long n) {
		int counter = 0;
		while (n > 9) {
			long temp = n;
			List<Long> array = new ArrayList<>();
			do {
				array.add(temp % 10);
				temp /= 10;
			} while (temp > 0);
			n = 1;
			for (Long l : array) {
				n *= l;
			}
			counter++;
		}
		return counter;
	}

}
