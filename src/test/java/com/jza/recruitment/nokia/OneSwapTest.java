package com.jza.recruitment.nokia;

import org.junit.Assert;
import org.junit.Test;

public class OneSwapTest {

	@Test
	public void test1() {
		int[] t1 = {1, 5, 3, 3, 7};
		Assert.assertEquals(true, OneSwap.solution(t1));
	}

	@Test
	public void test2() {
		int[] t2 = {1, 3, 5, 3, 4};
		Assert.assertEquals(false, OneSwap.solution(t2));
	}

	@Test
	public void test3() {
		int[] t3 = {1, 3, 5};
		Assert.assertEquals(true, OneSwap.solution(t3));
	}

	@Test
	public void test4() {
		int[] t4 = {1, 2, 3, 5, 4, 4};
		Assert.assertEquals(true, OneSwap.solution(t4));
	}

	@Test
	public void test5() {
		int[] t5 = {1, 5, 2, 5, 4};
		Assert.assertEquals(false, OneSwap.solution(t5));
	}

	@Test
	public void test6() {
		int[] t6 = {1, 5, 5, 1, 2, 3};
		Assert.assertEquals(false, OneSwap.solution(t6));
	}

	@Test
	public void test7() {
		int[] t7 = {1, 1, 5, 1, 1, 2, 3};

		Assert.assertEquals(false, OneSwap.solution(t7));

	}

	@Test
	public void test8() {
		int[] t8 = {10};
		Assert.assertEquals(true, OneSwap.solution(t8));

	}

	@Test
	public void test9() {
		int[] t9 = {1, 1, 5, 1, 1, 2, 1};

	}

	@Test
	public void test10() {
		int[] t10 = {1, 1, 5, 1, 1, 2, 1};
		Assert.assertEquals(true, OneSwap.solution(t10));
	}

}
