package com.jza.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeDecompTest {
	@Test
	public void testPrimeDecomp1() {
		assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
	}

	@Test
	public void testPrimeDecomp2() {
		assertEquals("(3)(7)(3229927)", PrimeDecomp.factors(67828467));
	}

	@Test
	public void testPrimeDecomp3() {
		assertEquals("(3)(283)(37657)", PrimeDecomp.factors(31970793));
	}

	@Test
	public void testPrimeDecomp4() {
		assertEquals("(24814871)", PrimeDecomp.factors(24814871));
	}

	@Test
	public void testPrimeDecomp5() {
		assertEquals("(7)(11)(931907)", PrimeDecomp.factors(71756839));
	}
}
