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
}
