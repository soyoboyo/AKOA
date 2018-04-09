package com.jza.lessons;

import org.junit.Assert;
import org.junit.Test;

public class L16GreedyAlgorithmsTest {

	@Test
	public void initMaxNonoverlappingSegments(){
		int[] t1A = {1, 3, 7, 9, 9};
		int[] t1B = {5, 6, 8, 9, 10};
		Assert.assertEquals(3, L16GreedyAlgorithms.maxNonoverlappingSegments(t1A, t1B));
	}
}
