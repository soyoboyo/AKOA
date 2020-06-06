package com.jza.dip.facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KaperkarsConstant {

	private final static int KAPREKAR_CONSTANT = 6174;
	private static int iter = 1;

	public static int countIterations(int n) {
		if (n == KAPREKAR_CONSTANT) {
			return 0;
		}
		int diff = transform(n, "desc") - transform(n, "asc");
		return countIterations(diff) + 1;
	}


	public static int transform(int n, String order) {
		int number = 0;
		String s = String.valueOf(n);
		List<Integer> digits = new ArrayList<>(s.length());

		for (int i = 0; i < s.length(); i++) {
			digits.add(Integer.valueOf(String.valueOf(s.charAt(i))));
		}


		if (order.equals("desc")) {
			if (digits.size() < 4) {
				int count = digits.size();
				while (count < 4) {
					digits.add(0);
					count++;
				}
			}
			Collections.sort(digits);
			Collections.reverse(digits);
		} else {
			Collections.sort(digits);
		}

		int power = digits.size() - 1;
		for (Integer digit : digits) {
			number += Math.pow(10, power) * digit;
			power--;
		}

		return number;
	}

}
