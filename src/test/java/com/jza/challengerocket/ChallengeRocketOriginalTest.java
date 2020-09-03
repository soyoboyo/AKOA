package com.jza.challengerocket;

import org.junit.jupiter.api.Test;

import static com.jza.challengerocket.ChallengeRocketOriginal.smallerNumberWithSameDigits;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ChallengeRocketOriginalTest {

	@Test
	public void test1_smallerNumberWithSameDigits() {
		assertEquals(15, smallerNumberWithSameDigits(51));
	}

	@Test
	public void test2_smallerNumberWithSameDigits() {
		assertEquals(223, smallerNumberWithSameDigits(232));
	}

	@Test
	public void test3_smallerNumberWithSameDigits() {
		assertEquals(-1, smallerNumberWithSameDigits(444));
	}

	@Test
	public void test4_smallerNumberWithSameDigits() {
		assertEquals(-1, smallerNumberWithSameDigits(49));
	}

	@Test
	public void test5_smallerNumberWithSameDigits() {
		assertEquals(1, smallerNumberWithSameDigits(10));
	}

	@Test
	public void test6_smallerNumberWithSameDigits() {
		// 123, 132 / 213, 231 / 312, 321
		assertEquals(312, smallerNumberWithSameDigits(321));
	}

}
