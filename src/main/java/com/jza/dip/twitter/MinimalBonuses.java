package com.jza.dip.twitter;

public class MinimalBonuses {

	public static int[] getBonuses(int[] performances) {
		int length = performances.length;
		int[] bonuses = new int[length];
		for (int i = 1; i < length - 1; i++) {
			int p = performances[i], bonus = 1;
			if (p > performances[i - 1]) {
				bonus++;
			}
			if (p > performances[i + 1]) {
				bonus++;
			}
			bonuses[i] = bonus;

		}
		if (performances[0] > performances[1]) {
			bonuses[0] = 2;
		} else {
			bonuses[0] = 1;
		}
		if (performances[length - 1] > performances[length - 2]) {
			bonuses[length - 1] = 2;
		} else {
			bonuses[length - 1] = 1;
		}

		return bonuses;
	}
}
