package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumNumbersInStringTest {


	@Test
	public void test1() {
		assertEquals(123, SumNumbersInString.sumNumbers("abc123xyz"));
	}

	@Test
	public void test2() {
		assertEquals(44, SumNumbersInString.sumNumbers("aa11b33"));
	}

	@Test
	public void test3() {
		assertEquals(18, SumNumbersInString.sumNumbers("7 11"));
	}
}
