package com.jza.leet.aprilchallange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuySellStock2Test {
	@Test
	public void test1() {
		int[] input = {7, 1, 5, 3, 6, 4};
		assertEquals(7, BuySellStock2.maxProfit(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 2, 3, 4, 5};
		assertEquals(4, BuySellStock2.maxProfit(input));
	}

	@Test
	public void test3() {
		int[] input = {7, 6, 4, 3, 1};
		assertEquals(0, BuySellStock2.maxProfit(input));
	}
}
