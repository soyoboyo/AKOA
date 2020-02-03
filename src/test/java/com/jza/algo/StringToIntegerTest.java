package com.jza.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerTest {

	@Test
	public void test1() {
		assertEquals(123, StringToInteger.convert("123").intValue());
		assertEquals(null, StringToInteger.convert("asdf"));
	}
}
