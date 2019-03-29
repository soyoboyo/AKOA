package com.jza.lessons;

import org.junit.Assert;
import org.junit.Test;

public class DemoTaskTest {


	@Test
	public void test1() {
		int[] a = {1, 3, 6, 4, 1, 2};
		Assert.assertEquals(5, DemoTask.findSmall(a));
	}

	@Test
	public void test2() {
		int[] a = {1, 2, 3};
		Assert.assertEquals(4, DemoTask.findSmall(a));
	}

	@Test
	public void test3() {
		int[] a = {-1, -2, -3};
		Assert.assertEquals(1, DemoTask.findSmall(a));
	}

	@Test
	public void test4() {
		int[] a = {-1, -3};
		Assert.assertEquals(1, DemoTask.findSmall(a));
	}
}
