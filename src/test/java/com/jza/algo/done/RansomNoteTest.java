package com.jza.algo.done;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RansomNoteTest {

	@Test
	public void test1() {
		assertFalse(RansomNote.canMakeRansomNote("a", "b"));
	}

	@Test
	public void test2() {
		assertFalse(RansomNote.canMakeRansomNote("aa", "ab"));
	}

	@Test
	public void test3() {
		assertTrue(RansomNote.canMakeRansomNote("aa", "aab"));
	}

	@Test
	public void test4() {
		assertTrue(RansomNote.canMakeRansomNote("abcc", "aabbcc"));
	}

}
