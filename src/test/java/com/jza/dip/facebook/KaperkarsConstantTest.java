package com.jza.dip.facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KaperkarsConstantTest {
	@Test
	public void test() {
		assertEquals(3, KaperkarsConstant.countIterations(123));
	}

}
