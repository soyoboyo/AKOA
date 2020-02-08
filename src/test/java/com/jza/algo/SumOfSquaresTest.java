package com.jza.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfSquaresTest {

	@Test
	public void test1() {
		assertEquals(Arrays.asList(4, 9), SumOfSquares.getSquares(13));
	}

}
