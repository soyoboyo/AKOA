package com.jza.challenges.y2018;

import java.util.ArrayList;
import java.util.List;


public class TrailingZeros2018 {

	public static int trailingZeros(int[] A) {
		List<Integer> twos = new ArrayList<>();
		List<Integer> fives = new ArrayList<>();
		List<Integer> tens = new ArrayList<>();

		List<Integer> noiseFree = new ArrayList<>();


		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0 && A[i] % 5 == 0) {
				tens.add(A[i]);
			} else if (A[i] % 2 == 0) {
				twos.add(A[i]);
			} else if (A[i] % 5 == 0) {
				fives.add(A[i]);
			}
		}

		for (int i = 0; i < twos.size(); i++) {
			int power = findPossibleDivisions(twos.get(i), 2);
			noiseFree.add((int) Math.pow(2.0, power));
		}
		for (int i = 0; i < fives.size(); i++) {
			int power = findPossibleDivisions(fives.get(i), 5);
			noiseFree.add((int) Math.pow(5.0, power));
		}

		for (int i = 0; i < tens.size(); i++) {
			int counter = 0;
			int num = tens.get(i);
			while (num % 10 == 0) {
				counter++;
				num /= 10;
			}
			int thisManyTens = (int) Math.pow(10, counter);
			if (num % 2 == 0) {
				int leftover = (int) Math.pow(2, findPossibleDivisions(num, 2));
				noiseFree.add(leftover * thisManyTens);
			} else if (num % 5 == 0) {
				int leftover = (int) Math.pow(5, findPossibleDivisions(num, 5));
				noiseFree.add(leftover * thisManyTens);
			} else {
				noiseFree.add(thisManyTens);
			}
		}
//		System.out.println(noiseFree.toString());

		int maxZeros = 0;
		for (int i = 0; i < noiseFree.size(); i++) {
			for (int j = 0; j < noiseFree.size(); j++) {
				for (int k = 0; k < noiseFree.size(); k++) {
					if (i != j && i != k && j != k) {
						int val = noiseFree.get(i) * noiseFree.get(j) * noiseFree.get(k);
//						System.out.println(val);
						int div = findPossibleDivisions(val, 10);
						if (div > maxZeros) {
							maxZeros = div;
						}
					}
				}
			}
		}

		return maxZeros;
	}

	public static int findPossibleDivisions(int number, int divider) {
		int counter = 0;
		while (number % divider == 0) {
			counter++;
			number /= divider;
		}
		return counter;
	}

}
