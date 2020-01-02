package com.jza.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[]{0, 1}, TwoSum.twoSumOfficialAnswer(new int[]{2, 7, 11, 15}, 9));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[]{2, 3}, TwoSum.twoSumOfficialAnswer(new int[]{2, 7, 11, 15}, 26));
	}
}
