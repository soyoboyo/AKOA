package com.jza.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeafRatsOfHamelinTest {
	private DeafRatsOfHamelin deafRatsOfHamelin = new DeafRatsOfHamelin();

	@Test
	public void ex1() {
		assertEquals(0, deafRatsOfHamelin.countDeafRats("~O~O~O~O P"));
	}

	@Test
	public void ex2() {
		assertEquals(1, deafRatsOfHamelin.countDeafRats("P O~ O~ ~O O~"));
	}

	@Test
	public void ex3() {
		assertEquals(2, deafRatsOfHamelin.countDeafRats("~O~O~O~OP~O~OO~"));
	}

}
