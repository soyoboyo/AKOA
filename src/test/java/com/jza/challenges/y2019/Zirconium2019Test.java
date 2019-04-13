package com.jza.challenges.y2019;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class Zirconium2019Test {

	Zirconium2019v2 t = new Zirconium2019v2();

	@Test
	public void test1() {
		int[] A = {4, 2, 1};
		int[] B = {2, 5, 3};
		Assertions.assertEquals(10, t.maxContribution(A, B, 2));
	}

	@Test
	public void test2() {
		int[] A = {7, 1, 4, 4};
		int[] B = {5, 3, 4, 3};
		Assertions.assertEquals(18, t.maxContribution(A, B, 2));
	}

	@Test
	public void test3() {
		int[] A = {5, 5, 5};
		int[] B = {5, 5, 5};
		Assertions.assertEquals(15, t.maxContribution(A, B, 1));
	}

	@Test
	public void test4() {
		int[] A = {1};
		int[] B = {3};
		Assertions.assertEquals(3, t.maxContribution(A, B, 0));
	}

	@Test
	public void test5() {
		int[] A = {1, 2, 3, 1};
		int[] B = {3, 1, 9, 4};
		Assertions.assertEquals(16, t.maxContribution(A, B, 2));
	}

	@Test
	public void test6() {
		int[] A = {1, 1, 2, 2};
		int[] B = {100, 101, 100, 102};
		Assertions.assertEquals(206, t.maxContribution(A, B, 2));
	}

	@Test
	public void test7() {
		int[] A = {1, 2, 3, 5, 5};
		int[] B = {4, 5, 6, 8, 1};
		Assertions.assertEquals(22, t.maxContribution(A, B, 3));
	}

	@Test
	public void test8() {
		int[] A = {3,3,3};
		int[] B = {1,1,1};
		Assertions.assertEquals(3, t.maxContribution(A, B, 0));
	}
}
