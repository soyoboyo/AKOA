package com.jza.dip.twitter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MinimalBonusesTest {

	@Test
	public void test() {
		int[] input = {1, 2, 3, 2, 3, 5, 1};
		int[] expected = {1, 2, 3, 1, 2, 3, 1};
		assertArrayEquals(expected, MinimalBonuses.getBonuses(input));
	}

}
