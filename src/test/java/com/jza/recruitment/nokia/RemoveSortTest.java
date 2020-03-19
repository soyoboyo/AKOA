package com.jza.recruitment.nokia;

import org.junit.Assert;
import org.junit.Test;

public class RemoveSortTest {

	@Test
	public void test1() {
		Assert.assertEquals(3, RemoveSort.solution("banana"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, RemoveSort.solution("anal"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(2, RemoveSort.solution("zyx"));
	}

	@Test
	public void test4() {
		Assert.assertEquals(2, RemoveSort.solution("aaababa"));
	}

}
