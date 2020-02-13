package com.jza.algo.done;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonDuplicateTest {

	@Test
	public void test1() {
		assertEquals(1, NonDuplicate.findUniqueXOR(new int[]{4, 3, 2, 4, 1, 3, 2, 2}));
	}

}
