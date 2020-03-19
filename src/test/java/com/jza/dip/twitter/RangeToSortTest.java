package com.jza.dip.twitter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RangeToSortTest {
	@Test
	public void test1() {
		int[] input = {1, 7, 9, 5, 7, 8, 10};
		int[] expected = {1, 5};
		assertArrayEquals(expected, RangeToSort.getRange(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 2, 3, 4, 1, 2, 3, 4};

		int[] expected = {1, 6};
		assertArrayEquals(expected, RangeToSort.getRange(input));
	}

	@Test
	public void test3() {
		int[] input = {1, 2, 3, 1, 2, 1, 2, 3, 4, 5};
		int[] inutp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] expected = {1, 6};
		assertArrayEquals(expected, RangeToSort.getRange(input));
	}
}
