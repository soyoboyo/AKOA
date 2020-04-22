package com.jza.algoexpert;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveArraysSumTest {
	@Test
	public void test1() {

	}

	@Test
	public void test2() {
		List<Object> test =
				new ArrayList<Object>(Arrays.asList(1, 2, new ArrayList<Object>(Arrays.asList(3)), 4, 5));
		assertEquals(18, RecursiveArraysSum.productSum(test));
	}

	@Test
	public void test4() {
		List<Object> test = new ArrayList<Object>();
		test.add(
				new ArrayList<Object>(Arrays.asList(
						new ArrayList<Object>(Arrays.asList(
								new ArrayList<Object>(Arrays.asList(
										new ArrayList<Object>(Arrays.asList(5)))))))));


		assertEquals(600, RecursiveArraysSum.productSum(test));
	}
}
