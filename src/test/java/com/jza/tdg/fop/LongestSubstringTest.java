package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

	@Test
	public void test1() {
		String substring = "abppplee";
		String[] dictionary = {"able", "ale", "apple", "bale", "kangaroo"};
		assertEquals("apple", LongestSubstring.solution(substring, dictionary));
	}
}
