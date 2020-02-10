package com.jza.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfSquares {

	public static Integer getSquares(Integer n) {
		List<Integer> squares = new ArrayList<>();
		for (int i = 1; i * i < n; i++) {
			squares.add(i * i);
		}

		List<Integer> minSums = new ArrayList<>(Collections.nCopies(n + 1, n));
		minSums.set(0, 0);
		for (int idx = 0; idx < minSums.size(); idx++) {
			for (Integer s : squares) {
				if (idx + s < minSums.size()) {
					int min = Math.min(minSums.get(idx + s), minSums.get(idx) + 1);
					minSums.set(idx + s, min);
				}
			}
		}
		return minSums.get(n);
	}
}
