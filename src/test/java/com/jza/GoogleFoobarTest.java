package com.jza;

import com.jza.foobar.GoogleFoobar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GoogleFoobarTest {
	@Test
	public void test11() {
		assertEquals("23571", GoogleFoobar.level1(0));
	}

	@Test
	public void test12() {
		assertEquals("71113", GoogleFoobar.level1(3));
	}

	@Test
	public void test13() {
		assertEquals("19232", GoogleFoobar.level1(10));
	}

	@Test
	public void test14() {
		assertEquals("19319", GoogleFoobar.level1(100));
	}


	@Test
	public void test21() {
		assertArrayEquals(new int[]{12, 1}, GoogleFoobar.level2a(new int[]{4, 30, 50}));
	}

	@Test
	public void test22() {
		assertArrayEquals(new int[]{-1, -1}, GoogleFoobar.level2a(new int[]{4, 17, 50}));
	}

	@Test
	public void test23() {
		assertArrayEquals(new int[]{-1, -1}, GoogleFoobar.level2a(new int[]{4, 13, 29, 52}));
	}

	@Test
	public void test24() {
		assertArrayEquals(new int[]{26, 3}, GoogleFoobar.level2a(new int[]{4, 17}));
	}


	@Test
	public void test25() {
		assertArrayEquals(new int[]{-1, -1}, GoogleFoobar.level2a(new int[]{1, 5, 6}));
	}

	@Test
	public void test2b1() {
		assertEquals(1, GoogleFoobar.level2b(10));
	}

	@Test
	public void test2b2() {
		assertEquals(3, GoogleFoobar.level2b(143));
	}


}
