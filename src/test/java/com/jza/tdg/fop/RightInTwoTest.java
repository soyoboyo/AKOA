package com.jza.tdg.fop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RightInTwoTest {

	@Test
	public void test1() {
		assertEquals(true, RightInTwo.CanDivideRightInTwo(new int[]{1, 1, 1, 2, 1}));
	}

	@Test
	public void test2() {
		assertEquals(false, RightInTwo.CanDivideRightInTwo(new int[]{2, 1, 1, 2, 1}));
	}

	@Test
	public void test3() {
		assertEquals(true, RightInTwo.CanDivideRightInTwo(new int[]{10, 10}));
	}

}
