package com.jza.recruitment.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDforNTest {

	@Test
	public void test1() {
		int[] input = {2, 3, 4, 5, 6};
		assertEquals(1, GCDforN.getGDC(input, input.length));
	}

	@Test
	public void test2() {
		int[] input = {2, 4, 6, 8, 10};
		assertEquals(2, GCDforN.getGDC(input, input.length));
	}

}
