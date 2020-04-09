package com.jza.leet.aprilchallange.week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspaceStringsTest {
	@Test
	public void test1() {
		String S = "ab#c", T = "ad#c";
		assertEquals(true, BackspaceStrings.backspaceCompare(S, T));
	}

	@Test
	public void test2() {
		String S = "ab##", T = "c#d#";
		assertEquals(true, BackspaceStrings.backspaceCompare(S, T));
	}

	@Test
	public void test3() {
		String S = "a##c", T = "#a#c";
		assertEquals(true, BackspaceStrings.backspaceCompare(S, T));
	}

	@Test
	public void test4() {
		String S = "a#c", T = "b";
		assertEquals(false, BackspaceStrings.backspaceCompare(S, T));
	}


}
