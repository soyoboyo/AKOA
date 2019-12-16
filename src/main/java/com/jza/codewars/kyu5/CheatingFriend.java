package com.jza.codewars.kyu5;

import java.util.LinkedList;

public class CheatingFriend {
	//	https://www.codewars.com/kata/is-my-friend-cheating/train/java

	public static LinkedList<long[]> isHeCheating(long n) {
		LinkedList<long[]> res = new LinkedList<long[]>();
		long sum = (n * n + n) / 2;
		for (long a = 1; a < n; a++) {
			double b = (sum - a) / (double) (a + 1);
			if (b <= n && b % 1 == 0) {
				res.add(new long[]{a, (long) b});
				res.add(new long[]{(long) b, a});
			}
		}
		return res;
	}
}
