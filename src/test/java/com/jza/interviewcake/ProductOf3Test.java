package com.jza.interviewcake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductOf3Test {
	@Test
	public void test1() {
		int[] input = {-10, -10, 1, 3, 2};
		assertEquals(300, ProductOf3.getHighestProduct(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 10, -5, 1, -100};
		assertEquals(5000, ProductOf3.getHighestProduct(input));
	}

}
