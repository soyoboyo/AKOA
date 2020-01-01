package com.jza.codewars.kyu5;

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

}
