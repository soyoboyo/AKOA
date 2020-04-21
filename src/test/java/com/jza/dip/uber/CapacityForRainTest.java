package com.jza.dip.uber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CapacityForRainTest {

	@Test
	void test1() {
		int[] input = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		assertEquals(6, CapacityForRain.getCapacity(input));
	}

	@Test
	void test2() {
		int[] input = {2, 1, 1, 2, 3};
		assertEquals(2, CapacityForRain.getCapacity(input));
	}

	@Test
	void test3() {
		int[] input = {3, 2, 1, 0, 1, 3};
		assertEquals(8, CapacityForRain.getCapacity(input));
	}

	@Test
	void tes4() {
		int[] input = {4, 1, 3, 1, 2, 1, 4};
		assertEquals(12, CapacityForRain.getCapacity(input));
	}

	@Test
	void tes5() {
		int[] input = {3, 0, 1, 0, 3};
		assertEquals(8, CapacityForRain.getCapacity(input));
	}

	@Test
	void tes6() {
		int[] input = {3, 0, 1, 0, 4};
		assertEquals(8, CapacityForRain.getCapacity(input));
	}

	@Test
	void tes7() {
		int[] input = {4, 0, 1, 0, 3};
		assertEquals(8, CapacityForRain.getCapacity(input));
	}

	@Test
	void tes8() {
		int[] input = {4, 0, 1, 0, 3, 2};
		assertEquals(8, CapacityForRain.getCapacity(input));
	}
}
