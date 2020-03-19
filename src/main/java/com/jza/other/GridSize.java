package com.jza.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridSize {

	public static class GridNode {
		public int x;
		public int y;
		public int id;
		public int color;

		public GridNode(int x, int y, int id, int color) {
			this.x = x;
			this.y = y;
			this.id = id;
			this.color = color;
		}
	}

	public static int getGridSize(int[][] grid) {
		Map<Integer, GridNode> nodes = generateNodes(grid);
		Map<Integer, List<Integer>> adjacencies = new HashMap<>();
		for (Map.Entry<Integer, GridNode> entry : nodes.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		return 0;
	}

	public static Map<Integer, GridNode> generateNodes(int[][] grid) {
		Map<Integer, GridNode> nodes = new HashMap<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				nodes.put(j + i * grid[0].length, new GridNode(i, j, j + i * grid[0].length, grid[i][j]));
			}
			System.out.println();
		}
		return nodes;
	}

	public static List<Integer> getAdjacencies() {
		return null;
	}
}
