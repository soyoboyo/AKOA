package com.jza.recruitment.atos;

import org.junit.Assert;
import org.junit.Test;

public class SlicesTest {

	@Test
	public void test1() {
		int[] t1 = {1, 1, 2, 5, 7};
		Assert.assertEquals(0, Slices.solution(t1));
	}

	@Test
	public void test2() {
		int[] t2 = {-1, 1, 3, 3, 3, 2, 1, 0};
		Assert.assertEquals(5, Slices.solution(t2));
	}

	@Test
	public void test3() {
		int[] t3 = {1, 3, 5, 7, 9};
		Assert.assertEquals(6, Slices.solution(t3));
	}

	@Test
	public void test4() {
		int[] t4 = {7, 7, 7, 7};
		Assert.assertEquals(3, Slices.solution(t4));
	}

	@Test
	public void test5() {
		int[] t5 = {3, -1, -5, -9};
		Assert.assertEquals(3, Slices.solution(t5));
	}

	@Test
	public void test6() {
		int[] t6 = {-1, 0, 1, 2};
		Assert.assertEquals(3, Slices.solution(t6));
	}

}
