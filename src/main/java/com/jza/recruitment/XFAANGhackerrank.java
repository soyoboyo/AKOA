package com.jza.recruitment;

import java.util.*;

public class XFAANGhackerrank {

	static int n = 0;
	static int m = 0;

	//		List<Integer> in = Arrays.asList(6, 12, 3, 9, 3, 5, 1);
	//		System.out.println(stockPairs(in, 12));

	public static List<Integer> onesGroups(List<List<Integer>> grid, List<Integer> queries) {
		n = grid.size();
		if (n == 0) {
			m = 0;
		} else {
			m = grid.get(0).size();
		}

		Map<Integer, Integer> islandSizes = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				if (grid.get(i).get(j) == 1) {
					int islandSize = sizeOfIsland(grid, i, j);
					islandSizes.merge(islandSize, 1, Integer::sum);
				}
		}
		List<Integer> result = new LinkedList<>();
		for (Integer q : queries) {
			result.add(islandSizes.getOrDefault(q, 0));
		}
		return result;
	}

	public static int sizeOfIsland(List<List<Integer>> grid, int i, int j) {
		if (i >= 0 && i < grid.size() && j >= 0 && j < grid.get(0).size() && grid.get(i).get(j) == 1) {
			grid.get(i).set(j, 0);
			return 1 + sizeOfIsland(grid, i + 1, j) + sizeOfIsland(grid, i - 1, j) + sizeOfIsland(grid, i, j - 1) + sizeOfIsland(grid, i, j + 1);
		}
		return 0;
	}


	public static int stockPairs(List<Integer> stocksProfit, long target) {
		Map<Integer, Integer> profitsCount = new HashMap<>();
		for (int s : stocksProfit) {
			profitsCount.merge(s, 1, Integer::sum);
		}
		Set<Integer> alreadyPaired = new HashSet<>();
		int result = 0;
		for (Integer p : profitsCount.keySet()) {
			int diff = (int) (target - p);
			if (target - p == p) {
				if (profitsCount.get(p) > 1) {
					result++;
					alreadyPaired.add(p);
				}
			} else if (profitsCount.containsKey(diff) && !alreadyPaired.contains(p)) {
				result++;
				alreadyPaired.add(diff);
				alreadyPaired.add(p);
			}
		}
		return result;
	}

}
