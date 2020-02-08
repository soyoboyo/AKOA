package com.jza.dip.facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {


	@Test
	public void test1() {
		int[] input = {0, 0, 0, 2, 0, 1, 3, 4, 0, 0};
		int[] expected = {2, 1, 3, 4, 0, 0, 0, 0, 0, 0};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}
}
