package com.jza.challenges.y2021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheMatrixTest {

	@Test
	public void test1() {
		assertEquals(2, TheMatrix.solution(new int[]{1, 2, 5, 3, 1, 3}));
	}

	@Test
	public void test2() {
		assertEquals(3, TheMatrix.solution(new int[]{3, 3, 5, 4}));
	}

	@Test
	public void test3() {
		assertEquals(4, TheMatrix.solution(new int[]{6, 5, 5, 6, 2, 2}));
	}

	@Test
	public void test4() {
		assertEquals(1, TheMatrix.solution(new int[]{1}));
	}

	@Test
	public void test5() {
		assertEquals(1, TheMatrix.solution(new int[]{1, 1, 1, 1}));
	}

}
