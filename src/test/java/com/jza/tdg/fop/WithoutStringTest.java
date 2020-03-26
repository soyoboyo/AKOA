package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutStringTest {
	@Test
	public void test1() {
		assertEquals("He there", WithoutString.withoutString("Hello there", "llo"));
	}

	@Test
	public void test2() {
		assertEquals("Hllo thr", WithoutString.withoutString("Hello there", "e"));
	}

	@Test
	public void test3() {
		assertEquals("Hello there", WithoutString.withoutString("Hello there", "x"));
	}

	@Test
	public void test4() {
		assertEquals("Th  a FH", WithoutString.withoutString("This is a FISH", "IS"));
	}

	@Test
	public void test5() {
		assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "is"));
	}

	@Test
	public void test6() {
		assertEquals("TH  a FH", WithoutString.withoutString("THIS is a FISH", "iS"));
	}

	@Test
	public void test7() {
		assertEquals("x", WithoutString.withoutString("xxx", "xx"));
	}

	@Test
	public void test8() {
		assertEquals("xzz", WithoutString.withoutString("xyzzy", "Y"));
	}

	@Test
	public void test9() {
		assertEquals("abxab", WithoutString.withoutString("abxxxab", "xx"));
	}

	@Test
	public void test10() {
		assertEquals("Hi ", WithoutString.withoutString("Hi HoHo", "Ho"));
	}


}
