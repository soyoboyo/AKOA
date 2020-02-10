package com.jza.dip.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SpiralMatrix {
	public static Integer[] gridToSpiral(int[][] grid) {
		int width = grid[0].length;
		int height = grid.length;
		List<Integer> spiral = new ArrayList<>(width * height);
		System.out.println("w = " + width + ", h = " + height);
		int i = 0, j = 0;
		int leftStart = 0, upStart = 0;
		int widthIter = 0, heightIter = 0;
		int counter = width * height;
		while (counter > 0) {

			// go right
			while (j < width) {
				spiral.add(grid[i][j]);
				j++;
				counter--;
			}
			if (counter == 0) {
				break;
			}
			j--;
			i++;
			width--;
			upStart++;
			// go down
			while (i < height) {
				spiral.add(grid[i][j]);
				i++;
				counter--;
			}
			if (counter == 0) {
				break;
			}
			j--;
			i--;
			height--;
			// go left
			while (j >= leftStart) {
				spiral.add(grid[i][j]);
				j--;
				counter--;
			}
			if (counter == 0) {
				break;
			}
			j++;
			i--;
			leftStart++;

			// go up
			while (i >= upStart) {
				spiral.add(grid[i][j]);
				i--;
				counter--;
			}
			if (counter == 0) {
				break;
			}
			i++;
			j++;
		}


		System.out.println(Arrays.toString(spiral.toArray()));
		return spiral.stream().toArray(Integer[]::new);
	}
	
}
