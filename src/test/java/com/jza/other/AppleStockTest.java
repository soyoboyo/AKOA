package com.jza.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleStockTest {

	@Test
	public void test1() {
		int[] prices = {10, 7, 5, 8, 11, 9};
		assertEquals(6, AppleStock.maxProfit(prices));
	}

	@Test
	public void test2() {
		int[] prices = {10, 7, 9, 8, 11, 5};
		assertEquals(4, AppleStock.maxProfit(prices));
	}

	@Test
	public void test3() {
		int[] prices = {10, 11, 9, 8, 7, 6};
		assertEquals(1, AppleStock.maxProfit(prices));
	}

}
