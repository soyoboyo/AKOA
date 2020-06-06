package com.jza.coderpro.done;

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

	@Test
	public void test3() {
		assertArrayEquals(new int[]{1, 2}, TwoSum.twoSumOfficialAnswer(new int[]{3, 2, 4}, 6));
	}
}
