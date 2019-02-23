package com.jza.challenges.y2018;

import com.jza.challenges.y2018.TrailingZeros2018;
import org.junit.Assert;
import org.junit.Test;

public class TrailingZeros2018Test {

	@Test
	public void trailingZeros() {
		int[] t1 = {7, 15, 6, 20, 5, 10};
		int[] t2 = {25, 10, 25, 10, 32};
		int[] t3 = {625, 10, 4, 10, 4, 10};
		int[] t4 = {625, 20, 8, 10, 4, 50, 77};


		Assert.assertEquals(3, TrailingZeros2018.trailingZeros(t1));
		Assert.assertEquals(4, TrailingZeros2018.trailingZeros(t2));
		Assert.assertEquals(4, TrailingZeros2018.trailingZeros(t3));
		Assert.assertEquals(5, TrailingZeros2018.trailingZeros(t4));


	}
}
