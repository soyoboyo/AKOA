package com.jza.mock.amazon;

import java.util.*;

public class EquivalentDominoPairs {
	public static int numEquivDominoPairs(int[][] dominoes) {

		Map<Integer, Integer> pairs = new HashMap<>();
		for (int i = 0; i < dominoes.length; i++) {
			List<Integer> asdf = new ArrayList<>(Arrays.asList(1, 2));
			int[] domino = dominoes[i];
			int number = domino[0] * 10 + domino[1];

			if (pairs.get(number) == null) {
				pairs.put(number, 1);
			} else {
				pairs.put(number, pairs.get(number) + 1);
			}

		}
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("first " + key + " " + value);
			if (key / 10 == key % 10 && value > 1) {
				count += choose(value, 2);
			} else if (pairs.get(reverseNumber(key)) != null && (key / 10 != key % 10)) {
				int reversedCount = pairs.get(reverseNumber(key));
				count += choose(reversedCount + value, 2);
				pairs.put(key, 0);
				pairs.put(reverseNumber(key), 0);
			} else if (value > 1) {
				count += choose(value, 2);
				pairs.put(key, 0);
			}

		}
		return count;
	}

	public static int reverseNumber(int n) {
		return n % 10 * 10 + n / 10;
	}

	public static long choose(int total, int choose) {
		if (total < choose)
			return 0;
		if (choose == 0 || choose == total)
			return 1;
		return choose(total - 1, choose - 1) + choose(total - 1, choose);
	}
}
