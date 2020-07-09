package com.jza.pramp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrampSolutionsTest {

	@Test
	public void test1shortestWordEditPath() {
		String[] input = {"but", "put", "big", "pot", "pog", "dog", "lot"};
		assertEquals(5, PrampSolutions.fromPramp_shortestWordEditPath("bit", "dog", input));
	}

	@Test
	public void test2shortestWordEditPath() {
		String[] input = {"but", "put", "big", "pot", "pog", "pig", "dog", "lot"};
		assertEquals(3, PrampSolutions.fromPramp_shortestWordEditPath("bit", "pog", input));
	}

	@Test
	public void test3shortestWordEditPath() {
		String[] input = {"to"};
		assertEquals(-1, PrampSolutions.fromPramp_shortestWordEditPath("no", "go", input));
	}

	@Test
	public void test4shortestWordEditPath() {
		String[] input = {"abc", "ab"};
		assertEquals(-1, PrampSolutions.fromPramp_shortestWordEditPath("abc", "ab", input));
	}
}
