package com.jza.dip.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexTest {

	@Test
	public void test1() {
		int[] input = {3, 5, 0, 1, 3};
		assertEquals(3, HIndex.getHIndex(input));

	}

}
