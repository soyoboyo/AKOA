package com.jza.challenges.y2019;

import org.junit.Assert;
import org.junit.Test;

public class Yttrium2019Test {

	@Test
	public void test1() {
		Assert.assertEquals(3, Yttrium2019.removingSegment("abaacbca", 2));
	}

	@Test
	public void test2() {
		Assert.assertEquals(5, Yttrium2019.removingSegment("aabcabc", 1));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, Yttrium2019.removingSegment("zaaaa", 1));
	}

	@Test
	public void test4() {
		Assert.assertEquals(-1, Yttrium2019.removingSegment("aaaa", 2));
	}

}
