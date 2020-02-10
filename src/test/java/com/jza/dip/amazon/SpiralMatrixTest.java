package com.jza.dip.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

	@Test
	public void test1() {
		int[][] grid = {{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}};
		Integer[] expected = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};
		System.out.println("1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12");
		Assertions.assertArrayEquals(expected, SpiralMatrix.gridToSpiral(grid));
	}

	@Test
	public void test2() {
		int[][] grid = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		Integer[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};
		System.out.println("1, 2, 3, 6, 9, 8, 7, 4, 5");
		Assertions.assertArrayEquals(expected, SpiralMatrix.gridToSpiral(grid));
	}

}
