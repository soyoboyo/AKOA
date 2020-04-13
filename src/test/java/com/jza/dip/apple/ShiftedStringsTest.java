package com.jza.dip.apple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShiftedStringsTest {
	@Test
	public void test1() {
		assertEquals(true, ShiftedStrings.isShifted("abcde", "cdeab"));
	}

	@Test
	public void test2() {
		assertEquals(false, ShiftedStrings.isShifted("abc", "acb"));
	}

}
