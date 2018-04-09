package com.jza.lessons;

import org.junit.Assert;
import org.junit.Test;

public class DemoTaskTest {
	@Test
	public void initFindSmall() {
		int[] t1 = {1, 3, 6, 4, 1, 2};
		int[] t2 = {1,2,3};
		int[] t3 = {-1,-2,-3};
		int[] t4 = {-1, -3};
		Assert.assertEquals(5, DemoTask.findSmall(t1));
		Assert.assertEquals(4, DemoTask.findSmall(t2));
		Assert.assertEquals(1, DemoTask.findSmall(t3));
		Assert.assertEquals(1, DemoTask.findSmall(t4));
	}
}
