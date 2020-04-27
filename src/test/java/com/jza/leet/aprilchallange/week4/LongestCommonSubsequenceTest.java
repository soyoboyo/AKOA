package com.jza.leet.aprilchallange.week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {
	@Test
	public void test1() {
		assertEquals("ace", LongestCommonSubsequence.getLongestCommonSubsequence("abcde", "ace"));
	}

	@Test
	public void test2() {
		assertEquals("ac", LongestCommonSubsequence.getLongestCommonSubsequence("abc", "acb"));
	}

	@Test
	public void test3() {
		assertEquals("abc", LongestCommonSubsequence.getLongestCommonSubsequence("abc", "abc"));
	}

	@Test
	public void test4() {
		assertEquals("", LongestCommonSubsequence.getLongestCommonSubsequence("abc", "def"));
	}


}
