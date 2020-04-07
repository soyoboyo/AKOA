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

	@Test
	public void test2() {
		int[] input = {1, 0};
		int[] expected = {1, 0};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}

	@Test
	public void test3() {
		int[] input = {1};
		int[] expected = {1};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}

	@Test
	public void test4() {
		int[] input = {2, 1};
		int[] expected = {2, 1};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}

	@Test
	public void test5() {
		int[] input = {0, 1, 0, 3, 12};
		int[] expected = {1, 3, 12, 0, 0};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}

	@Test
	public void test6() {
		int[] input = {1, 0, 1};
		int[] expected = {1, 1, 0};
		assertArrayEquals(expected, MoveZeroes.sort(input));
	}
}
