package com.jza.mock.amazon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EquivalentDominoPairsTest {

	@Test
	public void test1() {
		int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
		Assertions.assertEquals(1, EquivalentDominoPairs.numEquivDominoPairs(dominoes));
	}

	@Test
	public void test2() {
		int[][] dominoes = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
		Assertions.assertEquals(3, EquivalentDominoPairs.numEquivDominoPairs(dominoes));
	}

}
