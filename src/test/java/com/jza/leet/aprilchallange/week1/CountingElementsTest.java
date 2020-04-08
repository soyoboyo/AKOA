package com.jza.leet.aprilchallange.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingElementsTest {

	@Test
	public void test1() {
		int[] input = {1, 2, 3};
		assertEquals(2, CountingElements.countElements(input));
	}

	@Test
	public void test2() {
		int[] input = {1, 1, 3, 3, 5, 5, 7, 7};
		assertEquals(0, CountingElements.countElements(input));
	}

	@Test
	public void test3() {
		int[] input = {1, 3, 2, 3, 5, 0};
		assertEquals(3, CountingElements.countElements(input));
	}

	@Test
	public void test4() {
		int[] input = {1, 1, 2, 2};
		assertEquals(2, CountingElements.countElements(input));
	}

	@Test
	public void test5() {
		int[] input = {1, 1, 2};
		assertEquals(2, CountingElements.countElements(input));
	}

}
