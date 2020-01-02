package com.jza.codewars.kyu5;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {
		int sum = (n * n + n) / 2;
		int totalNumbers = n;

		int iterations = 0;
		int leftOver = 0;
		while (totalNumbers > 1) {
			if (totalNumbers / k > 0) {
				leftOver = k - totalNumbers % k;
				for (int i = k; i < totalNumbers; i++) {
					sum -= i;
					totalNumbers--;
					System.out.println("sum " + sum);
					System.out.println("numbers " + totalNumbers);
				}
				iterations++;
			}
			iterations++;
		}
		return sum;
	}

	public static int josephusSurvivorBruteforce(int n, int k) {
		List<Integer> nums = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			nums.add(i);
		}
		System.out.println(nums);
		int indexToRemove = k - 1;
		int initSize = nums.size();
		while (nums.size() > 1) {
			while (indexToRemove + k < initSize) {
				nums.remove(indexToRemove);
				indexToRemove += k;
			}
			initSize = nums.size();
		}
		return k;
	}

}
