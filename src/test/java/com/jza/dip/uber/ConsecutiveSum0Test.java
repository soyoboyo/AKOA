package com.jza.dip.uber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsecutiveSum0Test {

	@Test
	public void test1() {
		LinkedList<Integer> input = new LinkedList<>();
		input.addAll(Arrays.asList(10, 5, -3, -3, 1, 4, -4));
		LinkedList<Integer> output = ConsecutiveSum0.removeConsecutiveSumTo0(input);
		assertAll(() -> {
			assertEquals(1, output.size());
			assertEquals(10, output.getFirst().intValue());
		});

	}

}
