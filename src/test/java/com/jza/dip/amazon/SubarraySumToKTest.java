package com.jza.dip.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SubarraySumToKTest {
	@Test
	public void test() {
		int[] input = {1, 3, 2, 5, 7, 2};
		int[] expected = {2, 5, 7};
		assertArrayEquals(expected, SubarraySumToK.findContinuousK(input, 14));
	}

}
