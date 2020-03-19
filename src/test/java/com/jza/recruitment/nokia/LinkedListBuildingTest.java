package com.jza.recruitment.nokia;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBuildingTest {

	@Test
	public void test1() {
		int[] t1 = {1, 4, -1, 3, 2};
		Assert.assertEquals(4, LinkedListBuilding.solution(t1));
	}

	@Test
	public void test2() {
		int[] t2 = {3, 4, 2, 1, 5, -1};
		Assert.assertEquals(5, LinkedListBuilding.solution(t2));
	}

	@Test
	public void test3() {
		int[] t3 = {6, 3, 4, -1, 1, 2, 5};
		Assert.assertEquals(7, LinkedListBuilding.solution(t3));
	}

	@Test
	public void test4() {
		int[] t4 = {-1, 4, 2, 1};
		Assert.assertEquals(1, LinkedListBuilding.solution(t4));
	}

}
