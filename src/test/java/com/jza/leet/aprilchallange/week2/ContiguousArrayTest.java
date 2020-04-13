package com.jza.leet.aprilchallange.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousArrayTest {
	@Test
	public void test1() {
		int[] input = {0, 1};
		assertEquals(2, ContiguousArray.findMaxLength(input));
	}

	@Test
	public void test2() {
		int[] input = {0, 1, 0};
		assertEquals(2, ContiguousArray.findMaxLength(input));
	}

	@Test
	public void test3() {
		int[] input = {0, 0, 1, 0, 0, 0, 1, 1};
		assertEquals(6, ContiguousArray.findMaxLength(input));
	}

	@Test
	public void test4() {
		int[] input = {0, 1, 1, 0, 1, 1, 1, 0};
		assertEquals(4, ContiguousArray.findMaxLength(input));
	}

	@Test
	public void test5() {
		int[] input = {0, 1, 1, 0, 1};
		assertEquals(4, ContiguousArray.findMaxLength(input));
	}

}
