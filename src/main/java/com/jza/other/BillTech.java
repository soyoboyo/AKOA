package com.jza.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillTech {

	public class World {

		int[][] map;

		public int getNumberOfSeparatedRegions() {
			return 0;
		}
	}

	public class Country {
		List<Region> regions;

		public List<Region> findAllCountryRegionsForRegion(Region region) {
			return null;
		}


	}

	public class Region {
		int x;
		int y;
		int val;

		public boolean checkIfIsTheSameValRegion(Region neighbor) {
			return false;
		}

	}

	public static void main(String[] args) {
		int[][] input = {
				{0, 4, 1, 3},
				{1, 4, 2, 2},
				{3, 1, 1, 2},
				{3, 1, 2, 3},
				{1, 1, 1}
		};
//		System.out.println(countCells(input));
//		System.out.println(countCellsForRows(input));
	}

	public static Map<Integer, Integer> countCountries(int[][] map) {
		Map<Integer, Integer> counts = new HashMap<>();
		int[][] visited = new int[map.length][map[0].length];
		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[i].length - 1; j++) {
				int val = map[i][j];

			}

		}
		return counts;
	}

//	public static int dfs(int[][] map, int[][] visited, int i, int j, int val){
//		if(visited[i][j] != 1  && map[i][j] == val){
//			// check left
//			if(j > 0){
//				dfs(map, visited, i, j - 1, val);
//			}
//			// check right
//			if(j < map[i].length){
//				dfs(map, visited, i, j + 1, val);
//			}
//
//			// check up
//
//
//			// check down
//
//			visited[i][j] = 1;
//		}
//
//
//	}


	public static Map<Integer, Integer> countCells(int[][] map) {
		Map<Integer, Integer> counts = new HashMap<>();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				int val = map[i][j];
				if (!counts.containsKey(val)) {
					counts.put(val, 1);
				} else {
					counts.put(val, counts.get(val) + 1);
				}
			}
		}
		return counts;
	}

	public static Map<Integer, Integer> countCellsForRows(int[][] map) {
		Map<Integer, Integer> counts = new HashMap<>();
		for (int i = 0; i < map.length; i++) {
			int countries = 1;
			for (int j = 0; j < map[i].length - 1; j++) {
				int current = map[i][j];
				int next = map[i][j + 1];
				if (current != next) {
					countries++;
				}
			}
			counts.put(i, countries);
		}
		return counts;
	}


}
