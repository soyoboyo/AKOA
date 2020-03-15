package com.jza.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridSizeTest {


	@Test
	public void test1() {
		int[][] input = {
				{1, 1, 2, 3},
				{1, 2, 3, 2},
				{3, 2, 2, 2}};

		assertEquals(5, GridSize.getGridSize(input));
	}

}
