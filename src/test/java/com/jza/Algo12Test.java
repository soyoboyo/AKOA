package com.jza;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Algo12Test {


	@Test
	public void test2() {
		//given
		int[] input = new int[]{3, 3, 3, 3, 3, 1, 3};

		// when
		List<List<Integer>> output = Algo12.groupThePeople(input);

		// then
		assertArrayEquals(new List[]{output}, new int[][]{input});
	}


	@Test
	public void test() {
		//given
		int input = 234;

		// when
		int output = Algo12.subtractProductAndSum(input);

		// then
		assertEquals(15, output);
	}
}
