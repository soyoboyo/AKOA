package com.jza.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProtectTreesTest {

	@Test
	public void test1() {
		assertEquals("1 2 4 10", ProtectTrees.decompose(11));
	}

	@Test
	public void test2() {
		assertEquals("1 3 5 8 49", ProtectTrees.decompose(50));
	}

	@Test
	public void test3() {
		assertEquals(null, ProtectTrees.decompose(2));
	}

	@Test
	public void test4() {
		assertEquals("1 2 3 5 7 173 15008", ProtectTrees.decompose(15009));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3 8 17 190 18233", ProtectTrees.decompose(18234));
	}

	@Test
	public void test6() {
		assertEquals("1 4 17 187 17637", ProtectTrees.decompose(17638));
	}

	@Test
	public void test7() {
		assertEquals("3 7 13 134 9091", ProtectTrees.decompose(9092));
	}

	@Test
	public void test8() {
		assertEquals("2 9 132 8754", ProtectTrees.decompose(8755));
	}
}
