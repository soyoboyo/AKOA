package com.jza.algoexpert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Algo1Test {

	@Test
	public void test1() {
		String filename = "abcdef";
		String pattern = "a*e?g";
		assertEquals(true, Algo1.globMatching(filename, pattern));
	}

	@Test
	public void test2() {
		String filename = "test123.py";
		String pattern = "test12?.py";
		assertEquals(true, Algo1.globMatching(filename, pattern));
	}

	@Test
	public void test3() {
		String filename = "abc";
		String pattern = "*";
		assertEquals(false, Algo1.globMatching(filename, pattern));
	}

	@Test
	public void test4() {
		String filename = "file.py";
		String pattern = "*.py";
		assertEquals(true, Algo1.globMatching(filename, pattern));
	}

	@Test
	public void test5() {
		String filename = "test123.py";
		String pattern = "test12?.py";
		assertEquals(true, Algo1.globMatching(filename, pattern));
	}

}
