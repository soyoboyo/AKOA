package com.jza.dip.facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpToEndTest {

	@Test
	public void test1() {
		int[] input = {3, 2, 5, 1, 1, 9, 3, 4};
		assertEquals(2, JumpToEnd.getJumps(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 1, 1, 1, 1};
		assertEquals(4, JumpToEnd.getJumps(input));
	}

	@Test
	public void test3() {
		int[] input = {3, 2, 1, 0, 4};
		assertEquals(4, JumpToEnd.getJumps(input));
	}

	@Test
	public void test4() {
		int[] input = {0, 2, 3};
		assertEquals(4, JumpToEnd.getJumps(input));
	}

	@Test
	public void test5() {
		int[] input = {0, 1, 1, 1};
		assertEquals(4, JumpToEnd.getJumps(input));
	}

	@Test
	public void test6() {
		int[] input = {0};
		assertEquals(4, JumpToEnd.getJumps(input));
	}

}
