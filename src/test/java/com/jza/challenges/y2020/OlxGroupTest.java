package com.jza.challenges.y2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OlxGroupTest {


	@Test
	public void test1() {
		int[] juice = {10, 2, 1, 1};
		int[] capacity = {10, 3, 2, 2};
		assertEquals(2, OlxGroup.solution(juice, capacity));
	}

	@Test
	public void test2() {
		int[] juice = {1, 2, 3, 4};
		int[] capacity = {3, 6, 4, 4};
		assertEquals(3, OlxGroup.solution(juice, capacity));
	}

	@Test
	public void test3() {
		int[] juice = {2, 3};
		int[] capacity = {3, 4};
		assertEquals(1, OlxGroup.solution(juice, capacity));
	}

	@Test
	public void test4() {
		int[] juice = {1, 1, 5};
		int[] capacity = {6, 5, 8};
		assertEquals(3, OlxGroup.solution(juice, capacity));
	}

	@Test
	public void test5() {
		int[] juice = {1, 2};
		int[] capacity = {4, 3};
		assertEquals(2, OlxGroup.solution(juice, capacity));
	}

}
