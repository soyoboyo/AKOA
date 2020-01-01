package com.jza.codewars.kyu5;

public class JosephusSurvivor {
	public static int josephusSurvivor(final int n, final int k) {
		int sum = (n * n + n) / 2;
		int totalNumbers = n;
		int leftOverModulo = n % k;
		int iterations = 0;
		while (totalNumbers > 1) {
			int counter = 0;
			for (int i = k; i < totalNumbers; i += k) {
				sum = sum - i;
				counter++;
				System.out.println(sum);
				System.out.println(totalNumbers);
			}
			totalNumbers -= counter;
			iterations++;
			leftOverModulo = totalNumbers % k;
		}
		return sum;
	}

}
