package com.jza.leet.aprilchallange.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumToKTest {
	@Test
	public void test1() {
		assertEquals(2, SubarraySumToK.getSubarraysCount(new int[]{1, 1, 1}, 2));
	}

	@Test
	public void test2() {
		assertEquals(2, SubarraySumToK.getSubarraysCount(new int[]{1, 3, 2, 5, 7, 2}, 14));
	}

	@Test
	public void test3() {
		assertEquals(4, SubarraySumToK.getSubarraysCount(new int[]{3, 4, 7, 2, -3, 1, 4, 2}, 7));
	}
}
