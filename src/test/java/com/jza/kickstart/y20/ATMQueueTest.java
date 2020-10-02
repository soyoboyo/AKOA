package com.jza.kickstart.y20;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class ATMQueueTest {

	@Test
	public void test1() {
		int[] people = {2, 7, 4};
		int limit = 3;
		int[] expected = {1, 3, 2};
		assertArrayEquals(expected, ATMQueue.getOrder(people, limit));
	}

	@Test
	public void test2() {
		int[] people = {9, 10, 4, 7, 2};
		int limit = 6;
		int[] expected = {3, 5, 1, 2, 4};
		assertArrayEquals(expected, ATMQueue.getOrder(people, limit));
	}

}
