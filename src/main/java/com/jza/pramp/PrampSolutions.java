package com.jza.pramp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrampSolutions {

	public static int[][] sumPairsToK(int[] arr, int k) {
		List<Integer> matchingNumbers = new ArrayList<>();
		// create set from array
		Set<Integer> set = IntStream.of(arr).boxed().collect(Collectors.toSet());
		System.out.println(IntStream.of(arr).boxed().collect(Collectors.toSet()));
		System.out.println(IntStream.of(arr).boxed().collect(Collectors.toList()));
		// iterate over array
		for (int i = 0; i < arr.length; i++) {
			// x = k + y -> x = k + arr[i]
			int x = k + arr[i];
			if (set.contains(x) && x != arr[i]) {
				matchingNumbers.add(arr[i]);
			}
		}

		int[][] result = new int[matchingNumbers.size()][2];
		for (int i = 0; i < matchingNumbers.size(); i++) {
			int y = matchingNumbers.get(i);
			result[i] = new int[]{k + y, y};
		}

		return result;
	}
}
