package com.jza.recruitment;

import org.junit.Assert;
import org.junit.Test;

public class NokiaVol2Test {

	@Test
	public void linkedListTest() {
		int[] t1 = {1, 4, -1, 3, 2};
		int[] t2 = {3, 4, 2, 1, 5, -1};
		int[] t3 = {6, 3, 4, -1, 1, 2, 5};
		int[] t4 = {-1, 4, 2, 1};
		Assert.assertEquals(4, NokiaVol2.linkedList(t1));
		Assert.assertEquals(5, NokiaVol2.linkedList(t2));
		Assert.assertEquals(7, NokiaVol2.linkedList(t3));
		Assert.assertEquals(1, NokiaVol2.linkedList(t4));
	}

	@Test
	public void oneSwapTest() {

		int[] t1 = {1, 5, 3, 3, 7};
		int[] t2 = {1, 3, 5, 3, 4};
		int[] t3 = {1, 3, 5};
		int[] t4 = {1, 2, 3, 5, 4, 4};
		int[] t5 = {1, 5, 2, 5, 4};
		int[] t6 = {1, 5, 5, 1, 2, 3};
		int[] t7 = {1, 1, 5, 1, 1, 2, 3};
		int[] t8 = {10};
		int[] t9 = {1, 1, 5, 1, 1, 2, 1};
		int[] t10 = {1, 1, 5, 1, 1, 2, 1};

		Assert.assertEquals(true, NokiaVol2.oneSwap(t1));
		Assert.assertEquals(false, NokiaVol2.oneSwap(t2));
		Assert.assertEquals(true, NokiaVol2.oneSwap(t3));
		Assert.assertEquals(true, NokiaVol2.oneSwap(t4));
		Assert.assertEquals(false, NokiaVol2.oneSwap(t5));
		Assert.assertEquals(false, NokiaVol2.oneSwap(t6));
		Assert.assertEquals(false, NokiaVol2.oneSwap(t7));
		Assert.assertEquals(true, NokiaVol2.oneSwap(t8));
		Assert.assertEquals(true, NokiaVol2.oneSwap(t10));

	}


}
