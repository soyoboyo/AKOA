package com.jza.leet.aprilchallange.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesisStringTest {
	@Test
	public void test() {
		assertTrue(ValidParenthesisString.checkValidString("()"));
	}

	@Test
	public void test2() {
		assertTrue(ValidParenthesisString.checkValidString("(*)"));
	}

	@Test
	public void test3() {
		assertFalse(ValidParenthesisString.checkValidString("(*))"));
	}

	@Test
	public void test4() {
		assertFalse(ValidParenthesisString.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
	}

}
