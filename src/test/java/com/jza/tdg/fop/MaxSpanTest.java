package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSpanTest {

	@Test
	public void test1() {
		int[] input = {1, 2, 1, 1, 3};
		assertEquals(4, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 4, 2, 1, 4, 1, 4};
		assertEquals(6, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test3() {
		int[] input = {1, 4, 2, 1, 4, 4, 4};
		assertEquals(6, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test4() {
		int[] input = {3, 3, 3};
		assertEquals(3, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test5() {
		int[] input = {3, 9, 3};
		assertEquals(3, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test6() {
		int[] input = {3, 3};
		assertEquals(2, MaxSpan.getMaxSpan(input));
	}

	@Test
	public void test7() {
		int[] input = {1};
		assertEquals(1, MaxSpan.getMaxSpan(input));
	}

}
