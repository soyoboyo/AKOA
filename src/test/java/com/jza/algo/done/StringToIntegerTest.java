package com.jza.algo.done;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerTest {

	@Test
	public void test1() {
		assertEquals(123, StringToInteger.convert("123").intValue());
		assertEquals(null, StringToInteger.convert("asdf"));
		assertEquals(-98234, StringToInteger.convert("-98234").intValue());
		assertEquals(null, StringToInteger.convert("").intValue());
	}

	@Test
	public void test2() {
		assertEquals(123, StringToInteger.convertOfficial("123").intValue());
		assertEquals(null, StringToInteger.convertOfficial("asdf"));
		assertEquals(-98234, StringToInteger.convertOfficial("-98234").intValue());
		assertEquals(null, StringToInteger.convertOfficial("").intValue());
	}
}
