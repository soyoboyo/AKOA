package com.jza.challenges.y2018;

import org.junit.Assert;
import org.junit.Test;

public class BalancedSubstring2018Test {

	@Test
	public void balancedSubstringTest(){

		String t1 = "cabbacc";
		String t2 = "abababa";
		String t3 = "aaaaaaa";
		String t4 = "ab";

		Assert.assertEquals(4, BalancedSubstring2018.balancedString(t1));
		Assert.assertEquals(6, BalancedSubstring2018.balancedString(t2));
		Assert.assertEquals(0, BalancedSubstring2018.balancedString(t3));
		Assert.assertEquals(2, BalancedSubstring2018.balancedString(t4));

	}

}
