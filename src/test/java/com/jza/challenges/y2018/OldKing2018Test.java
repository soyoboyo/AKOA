package com.jza.challenges.y2018;

import org.junit.Assert;
import org.junit.Test;

public class OldKing2018Test {

	@Test
	public void initialExamples() {
		int t1N = 5;
		int t1M = 5;
		int[] t1X = {0, 4, 2, 0};
		int[] t1Y = {0, 0, 1, 4};

		int t2N = 4;
		int t2M = 1;
		int[] t2X = {3, 1};
		int[] t2Y = {0, 0};

		int t3N = 1;
		int t3M = 3;
		int[] t3X = {0};
		int[] t3Y = {1};


		Assert.assertEquals(3, OldKing2018.solution(t1N, t1M, t1X, t1Y));
		Assert.assertEquals(2, OldKing2018.solution(t2N, t2M, t2X, t2Y));
		Assert.assertEquals(0, OldKing2018.solution(t3N, t3M, t3X, t3Y));

	}
}
