package com.jza.codewars.kyu5;

import java.util.ArrayList;
import java.util.List;

public class CheatingFriend {
	//	https://www.codewars.com/kata/is-my-friend-cheating/train/java
	public static List<long[]> isHeCheating(long n) {
		System.out.println("n = " + n);
		List<long[]> res = new ArrayList<>();
		long sum = getSum(n);
		long a = n / 2 - 1, b = n / 2;
		for (long i = n / 2 - 1; i <= n; i++) {
			a = i;
			for (long j = n / 2; j <= n; j++) {
				b = j;
				long sumWithout = sum - a - b;
				long product = a * b;
				if (product > sumWithout) {
					break;
				}
				System.out.println("a = " + a + ", b = " + b);
				System.out.println("sum = " + sumWithout + ", product = " + product);
				if (a != b && sumWithout == product) {
					res.add(new long[]{a, b});
					res.add(new long[]{b, a});
				}
			}
		}
		System.out.println("res size = " + res.size());
		return res;
	}

	private static long getSum(long n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
