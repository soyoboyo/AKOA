package com.jza.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProtectTreesTest {
	ProtectTrees protectTrees = new ProtectTrees();

	@Test
	public void test1() {
		long n = 11;
		assertEquals("1 2 4 10", protectTrees.decompose(n));
	}

	@Test
	public void test2() {
		long n = 50;
		assertEquals("1 3 5 8 49", protectTrees.decompose(n));
	}

	@Test
	public void test3() {
		long n = 2;
		assertEquals(null, protectTrees.decompose(n));
	}

	@Test
	public void test4() {
		long n = 15009;
		assertEquals("1 2 3 5 7 173 15008", protectTrees.decompose(n));
	}

	@Test
	public void test5() {
		long n = 18234;
		assertEquals("1 2 3 8 17 190 18233", protectTrees.decompose(n));
	}

	@Test
	public void test6() {
		long n = 17638;
		assertEquals("1 4 17 187 17637", protectTrees.decompose(n));
	}

	@Test
	public void test7() {
		long n = 9092;
		assertEquals("3 7 13 134 9091", protectTrees.decompose(n));
	}

	@Test
	public void test8() {
		long n = 8755;
		assertEquals("2 9 132 8754", protectTrees.decompose(n));
	}
}
