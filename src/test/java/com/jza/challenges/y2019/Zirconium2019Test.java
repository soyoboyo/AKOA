package com.jza.challenges.y2019;

import org.junit.Assert;
import org.junit.Test;

public class Zirconium2019Test {

	Zirconium2019 t = new Zirconium2019();

	@Test
	public void test1() {
		int[] A = {4, 2, 1};
		int[] B = {2, 5, 3};
		Assert.assertEquals(10, t.maxContribution(A, B, 2));
	}

	@Test
	public void test2() {
		int[] A = {7, 1, 4, 4};
		int[] B = {5, 3, 4, 3};
		Assert.assertEquals(18, t.maxContribution(A, B, 2));
	}

	@Test
	public void test3() {
		int[] A = {5, 5, 5};
		int[] B = {5, 5, 5};
		Assert.assertEquals(15, t.maxContribution(A, B, 1));
	}

	@Test
	public void test4() {
		int[] A = {1};
		int[] B = {3};
		Assert.assertEquals(3, t.maxContribution(A, B, 0));
	}

}
