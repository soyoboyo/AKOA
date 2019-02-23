package com.jza.challenges.y2018;

import org.junit.Assert;
import org.junit.Test;

public class CuttingComplexity2018Test {
	@Test
	public void oneSwap() {

		String t5 = "MLMLMLMLMLMLM"; // 13, 6
		String t6 = "MMMLMMMLLLLLLLLLMMMMM"; // 7, 1
		String t7 = "LM LM LM LM LM LM L"; // 13, 7

//		Assert.assertEquals(6, CuttingComplexity2018.longestInterval(t5, 13));
//		Assert.assertEquals(1, CuttingComplexity2018.longestInterval(t6, 7));

	}

	@Test
	public void test1() {
		String t1 = "MLMMLLM"; // 3, 1
		Assert.assertEquals(1, CuttingComplexity2018.longestInterval(t1, 3));
	}

	@Test
	public void test2() {
		String t2 = "MLMMMLMMMM"; // 2, 2
		Assert.assertEquals(2, CuttingComplexity2018.longestInterval(t2, 2));
	}

	@Test
	public void test3() {
		String t3 = "LLLMMLLLLLLMMMLLLLL"; // 5,  2
		Assert.assertEquals(2, CuttingComplexity2018.longestInterval(t3, 5));
	}

	@Test
	public void test4() {
		String t4 = "LLMMLLMMMMLLMMMLLLMM"; // 9, 2
//		Assert.assertEquals(2, CuttingComplexity2018.longestInterval(t4, 9));
	}
}
