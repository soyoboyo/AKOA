package com.jza.recruitment;

import com.jza.recruitment.Nokia;
import org.junit.Assert;
import org.junit.Test;

public class NokiaTest {
	@Test
	public void linkedList() {
		int[] t1 = {1, 4, -1, 3, 2};
		int[] t2 = {3, 4, 2, 1, 5, -1};
		int[] t3 = {-1, 3, 4, 0, 1, 2, 5};
		int[] t4 = {-1, 4, 2, 1};
		Assert.assertEquals(4, Nokia.linkedList(t1));
		Assert.assertEquals(5, Nokia.linkedList(t2));
		Assert.assertEquals(7, Nokia.linkedList(t3));
		Assert.assertEquals(1, Nokia.linkedList(t4));

	}

	@Test
	public void oneSwap(){
		int[] t1 = {1, 5, 3, 3, 7};
		int[] t2 = {1, 3, 5, 3, 4};
		int[] t3 = {1, 3, 5};
		int[] t4 = {1, 2, 3, 5, 4, 4};
		int[] t5 = {1, 5, 2, 5, 4};
		int[] t6 = {1, 5, 5, 1, 2, 3};
		int[] t7 = {1, 1, 5, 1, 1, 2, 3};

		Assert.assertEquals(true, Nokia.oneSwap(t1));
		Assert.assertEquals(false, Nokia.oneSwap(t2));
		Assert.assertEquals(true, Nokia.oneSwap(t3));
		Assert.assertEquals(true, Nokia.oneSwap(t4));
		Assert.assertEquals(false, Nokia.oneSwap(t5));
		Assert.assertEquals(false, Nokia.oneSwap(t6));
		Assert.assertEquals(false, Nokia.oneSwap(t7));


	}


}
