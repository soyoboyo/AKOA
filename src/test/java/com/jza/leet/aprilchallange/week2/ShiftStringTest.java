package com.jza.leet.aprilchallange.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftStringTest {
	@Test
	public void test1() {
		int[][] input = {{0, 1}, {1, 2}};
		assertEquals("cab", ShiftString.stringShift("abc", input));
	}

	@Test
	public void test2() {
		int[][] input = {{1, 4}, {0, 5}, {0, 4}, {1, 1}, {1, 5}};
		assertEquals("kmecs", ShiftString.stringShift("mecsk", input));
	}

	@Test
	public void test3() {
		int[][] input = {{0, 7}, {1, 7}, {1, 0}, {1, 3}, {0, 3}, {0, 6}, {1, 2}};
		assertEquals("hcjwpdh", ShiftString.stringShift("wpdhhcj", input));
	}

	@Test
	public void test4() {
		int[][] input = {{1, 8}, {1, 4}, {1, 3}, {1, 6}, {0, 6}, {1, 4}, {0, 2}, {0, 1}};
		assertEquals("yisxjwry", ShiftString.stringShift("yisxjwry", input));
	}
}
