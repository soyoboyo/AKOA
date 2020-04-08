package com.jza.leet.aprilchallange.week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HappyNumberTest {

	@Test
	public void test1() {
		assertEquals(false, HappyNumber.isHappy(3));
	}

	@Test
	public void test2() {
		assertEquals(true, HappyNumber.isHappy(7));
	}

}
