package com.jza.dip.google;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWitnessesTest {

	@Test
	public void test() {
		int[] h1 = {3, 6, 3, 4, 1};
		List<Integer> t1 = Arrays.asList(6, 4, 1);
		assertEquals(t1, CountWitnesses.getWitnesses(h1));
	}


}
