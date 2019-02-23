package com.jza.challenges.y2018;

import org.junit.Assert;
import org.junit.Test;

public class ZalandoCardsTest {
	@Test
	public void initialExamples() {
		int[] t1A = {1, 2, 4, 3};
		int[] t1B = {1, 3, 2, 3};
		int[] t2A = {4, 2, 1, 6, 5};
		int[] t2B = {3, 2, 1, 7, 7};
		int[] t3A = {2, 3};
		int[] t3B = {2, 3};
		int[] t4A = {1, 1};
		int[] t4B = {2, 2};

		Assert.assertEquals(5, ZalandoCards.maxScore(t1A, t1B));
		Assert.assertEquals(4, ZalandoCards.maxScore(t2A, t2B));
		Assert.assertEquals(1, ZalandoCards.maxScore(t3A, t3B));
		Assert.assertEquals(3, ZalandoCards.maxScore(t4A, t4B));

	}
}
