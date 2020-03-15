package com.jza.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Euler5Test {
	@Test
	public void test() {
		assertEquals(1, Euler5.multipliesOf3Or5(1000));
	}

}
