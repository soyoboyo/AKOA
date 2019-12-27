package com.jza.codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BooksellerHelpTest {

	@Test
	public void test1() {
		String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
		String cd[] = new String[]{"A", "B"};
		assertEquals("(A : 200) - (B : 1140)", BooksellerHelp.stockSummary(art, cd));
	}
}
