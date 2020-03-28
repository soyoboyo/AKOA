package com.jza.dip.microsoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LimitedComparisonsTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[]{1, 8}, LimitedComparisons.findMinAndMax(new int[]{3, 5, 1, 2, 4, 8}));
	}

}
